package com.easy;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber414 {
	public static int thirdMax(int[] nums) {

		HashSet<Integer> h = new HashSet<Integer>();

		Arrays.sort(nums);

		int a = 0;
		int b = 0;
		int c = 0;

		for (int num : nums) {

			if (!h.contains(num)) {
				h.add(num);
				if (a < num) {
					c = b;
					b = a;
					a = num;

				}

			}

		}
		if (nums.length > 2 && h.size() > 2) {
			return c;
		} else {

			return nums[nums.length - 1];
		}

	}

	public static void main(String[] args) {
		int[] i = { 3, 2, 1 };
		System.out.println(thirdMax(i));
	}
}
