package round1C_2019_B;

import java.util.Scanner;

public class Solution {

	private Scanner sc;

	private Solution(Scanner sc) {
		this.sc = sc;
	}

	public static void main(String[] args) {
		test(new Scanner(System.in), true);
	}

	static void test(Scanner sc, boolean multiCase) {
		if (multiCase) {
			int T = sc.nextInt();
			for (int tc = 1; tc <= T; ++tc) {
				out("Case #" + tc + ": ");
				Solution s = new Solution(sc);
				try {
					s.solve();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		} else {
			Solution s = new Solution(sc);
			try {
				s.solve();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	private void solve() {
		// TODO solve case here
	}

	/* UTIL classes and methods */
	private static void out(Object o) {
		System.out.println(o);
	}

	private static void out1(Object... args) {
		if (args.length == 0) {
			return;
		}
		outf(args[0]);
		for(int i = 1; i < args.length; ++i) {
			outf(' ');
			outf(args[i]);
		}
		System.out.println();
	}

	private static void outf(Object o) {
		System.out.print(o);
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
