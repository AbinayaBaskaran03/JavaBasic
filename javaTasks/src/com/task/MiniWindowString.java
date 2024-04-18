package com.task;

public class MiniWindowString {

	public static String findMinWindow(String N1, String K1) {

		String win = "";
		int i = 0;
		int min = N1.length() + 1;
		for (int j = 0; j < N1.length(); j++) {
			if (N1.charAt(j) == K1.charAt(i)) {
				i = i + 1;
				if (i == K1.length()) {
					int e = j + 1;
					i = i - 1;
					while (i >= 0) {
						if (N1.charAt(j) == K1.charAt(i)) {
							i = i - 1;
						}
						j = j - 1;
					}
					i = i + 1;
					j = j + 1;
					if (e - j < min) {
						min = e - j;
						win = N1.substring(j, e);
					}
				}
			}
		}
		return win;
	}

	public static void main(String argvs[]) {
		MiniWindowString miniobj = new MiniWindowString();

		String N = "aabcsdeabsed";
		String K = "sdeb";
		System.out.println("String 1 is : " + N);
		System.out.println("String 2 is : " + K);

		String str = miniobj.findMinWindow(N, K);
		System.out.println("The minimum substring is : " + str);
		System.out.println();

	}

}
