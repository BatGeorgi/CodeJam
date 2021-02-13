package template;

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
				String pref = "Case #" + tc + ": ";
				Solution s = new Solution(sc);
				try {
					Object result = s.solve();
					out(pref + result);
				} catch (Throwable t) {
					out(pref + t.getMessage());
					t.printStackTrace();
				}
			}
		} else {
			Solution s = new Solution(sc);
			try {
				Object result = s.solve();
				out(result);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	private Object solve() {
		// TODO solve case here
		return "";
	}

	/* UTIL classes and methods */
	private static void out(Object o) {
		System.out.println(o != null ? o.toString() : o);
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
