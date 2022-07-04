package io.murad.problems.one;

public class Solution {

	public static int[] twoSum(int nums[], int target) {
		int indicesOfTwoSum[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indicesOfTwoSum[0] = j;
					indicesOfTwoSum[1] = i;
				} else {
					
				}
			}

		}
		return indicesOfTwoSum;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int[] indicesOfTwoSum = twoSum(nums, 26);
		
		for (int indices : indicesOfTwoSum) {
			System.out.print(" " + indices);
		}
	}

}
