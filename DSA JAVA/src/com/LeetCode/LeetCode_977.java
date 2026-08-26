package com.LeetCode;

import java.util.Arrays;

public class LeetCode_977 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            for(int i=0;i<nums.length;i++){
                nums[i] = nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }

    }
}
