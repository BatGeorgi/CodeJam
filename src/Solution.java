import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private static boolean DEBUG = true;

	private Scanner sc;
	private PrintWriter pw;

	int T, F;

	private Solution(InputStream in, OutputStream out) throws IOException {
		this.sc = new Scanner(in);
		this.pw = new PrintWriter(out);
		readInitialData();
	}

	private void readInitialData() { // TODO check implementation and adjust if needed
		T = sc.nextInt();
		F = sc.nextInt();
	}

	public static void main(String[] args) throws IOException {
		DEBUG = false;
		test(System.in, System.out);
	}

	static void test(InputStream in, OutputStream out) throws IOException {
		Solution s = new Solution(in, out);
		try {
			s.solve();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void solve() {
		
	}

	/* UTIL classes and methods */
	private int readInt() {
		int res = sc.nextInt();
		if (DEBUG) {
			System.out.println("INPUT: " + res);
		}
		return res;
	}

	private long readLong() {
		long res = sc.nextLong();
		if (DEBUG) {
			System.out.println("INPUT: " + res);
		}
		return res;
	}

	private double readDouble() {
		double res = sc.nextDouble();
		if (DEBUG) {
			System.out.println("INPUT: " + res);
		}
		return res;
	}

	private String read() {
		String res = sc.next();
		if (DEBUG) {
			System.out.println("INPUT: " + res);
		}
		return res;
	}
	
	private void out(Object o) {
		String line = (o != null ? o.toString() : "null");
		if (DEBUG) {
			System.out.println("TO INTERACTOR:");
			System.out.println(line);
		}
		pw.println(line);
		pw.flush();
	}

	private void out1(Object[] args) {
		if (args.length == 0) {
			return;
		}
		if (DEBUG) {
			System.out.println("TO INTERACTOR:");
			System.out.print(args[1]);
		}
		pw.print(args[0]);
		for(int i = 1; i < args.length; ++i) {
			pw.print(' ');
			pw.print(args[i]);
			if (DEBUG) {
				System.out.print(' ');
				System.out.print(args[i]);
			}
		}
		pw.println();
	}

	private void out1(List<Object> args) {
		if (args.isEmpty()) {
			return;
		}
		boolean first = true;
		if (DEBUG) {
			System.out.println("TO INTERACTOR:");
		}
		for (Object o : args) {
			if (!first) {
				if (DEBUG) {
					System.out.print(' ');
				}
				pw.print(' ');
			} else {
				first = false;
			}
			if (DEBUG) {
				System.out.print(o);
			}
			pw.print(o);
		}
		pw.println();
	}

	private void outf(Object o) {
		if (DEBUG) {
			System.out.println("TO INTERACTOR:");
			pw.print(o);
		}
		pw.print(o);
	}

	static class PII {
		int x, y;
		PII(int x, int y) {
			this.x = y;
			this.y = y;
		}
	}

	static class PLL {
		long x, y;
		PLL(long x, long y) {
			this.x = x;
			this.y = y;
		}
	}

	static class PDD {
		double x, y;
		PDD(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Pair {
		Object x, y;
		Pair(Object x, Object y) {
			this.x = x;
			this.y = y;
		}
	}
}

