package round2_2020;

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
		long L = sc.nextLong(), R = sc.nextLong();
		long D = Math.abs(L - R);
		double rt = Math.sqrt(2 * D);
		long f = (long) rt;
		if (f * (f + 1) > 2 * D) {
			--f;
		}
		long n = f;
		if (L < R) {
			R -= (f * (f + 1)) / 2;
		} else {
			L -= (f * (f + 1)) / 2;
		}
		if (L < R) {
			long k = findK(R, f);
			if (k > 0) {
				n = f + k * 2 - 1;
				long remR = k * k + f * k;
				R -= remR;
				long remL = remR - k - f;
				L -= remL;
			}
		} else {
			long k = findK(L, f);
			if (k > 0) {
				n = f + k * 2 - 1;
				long remL = k * k + f * k;
				L -= remL;
				long remR = remL - k - f;
				R -= remR;
			}
		}
		if (L >= n + 1 || R >= n + 1) {
			++n;
			if (L >= R) {
				L -=n;
			} else {
				R -= n;
			}
		}
		return (n + " " + L + " " + R);
	}

	long findK(long R, long f) {
		long lb = 0, rb = 1000000000L + 1;
		for (int i = 0; i < 34; ++i) {
			long k = (lb + rb) / 2;
			long res = k * k + f * k;
			if (res == R) {
				return k;
			}
			if (res > R) {
				rb = k;
			} else {
				lb = k;
			}
		}
		return lb;
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
