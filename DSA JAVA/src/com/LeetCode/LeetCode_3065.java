package com.LeetCode;

import java.util.Scanner;

public class LeetCode_3065 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int num:nums){
            if(k>num){
                count++;
            }
        }
        System.out.println(count);
    }
}
