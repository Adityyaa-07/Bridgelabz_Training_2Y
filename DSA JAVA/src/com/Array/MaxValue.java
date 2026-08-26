package com.Array;

public class MaxValue {


    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 9};
        int maxValue = findMax(arr);
        System.out.println("Maximum value is: " + maxValue);
    }
}