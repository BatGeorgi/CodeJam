package template;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		testSamples();
		//testCase1();
		//testCase2();
		//testCase3();
		//testCustomSamples();
	}

	private static void testSamples() {
		test("input.txt", true);
	}

	private static void testCase1() {
		test("input.txt", true);
	}

	private static void testCase2() {
		test("input.txt", true);
	}

	private static void testCase3() {
		test("input.txt", true);
	}

	private static void testCustomSamples() {
		test("input.txt", true);
	}

	private static void test(String resource, boolean multiCase) {
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
