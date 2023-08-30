package com.binarysearch.easy;

public class FirstBadVersion {

	public static int firstBadVersion(int n) {
		
		if (n==1) {
			return n;
		}

		long l = 1;
		long r = n;
		long p = (r+l) / 2;

		while (true) {

			if((r-l)==1) {
				return (isBadVersion((int)l))?(int)l:(int)r;
			}

			boolean b = isBadVersion((int)p);

			if (b) {

				r = p;
				p = (r + l) / 2;

			} else if (!b) {
				l = p;
				p = (r + l) / 2;
			}

		}

	}

	public static boolean isBadVersion(int version) {
		return (version >= 1702766719) ? true : false;
	}

	public static void main(String[] args) {

		int i = 2126753390;
		
		System.out.println(firstBadVersion(i));
		
	}
}
