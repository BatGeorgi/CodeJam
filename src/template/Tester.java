package template;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Tester {

	private static final int TEST = 0;

	public static void main(String[] args) {
		switch (TEST) {
		case 0:
			testSamples();
			break;
		case 1:
			testCase1();
			break;
		case 2:
			testCase2();
			break;
		case 3:
			testCase3();
			break;
		case 4:
			testCustomSamples();
		}
	}

	private static void testSamples() {
		test("input.txt", true);
	}

	private static void testCase1() {
		test("case1.txt", false);
	}

	private static void testCase2() {
		test("case2.txt", false);
	}

	private static void testCase3() {
		test("case3.txt", false);
	}

	private static void testCustomSamples() {
		test("cases.txt", true);
	}

	private static void test(String resource, boolean multiCase) {
		System.out.println("INPUT: " + resource);
		InputStream is = Tester.class.getResourceAsStream(resource);
		if (is == null) {
			System.out.println("ERROR: " + resource + " does not exist!");
		}
		try {
			try (Scanner sc = new Scanner(is)) {
				Solution.test(sc, multiCase);
			}
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException ignore) {
			}
		}
	}

}
