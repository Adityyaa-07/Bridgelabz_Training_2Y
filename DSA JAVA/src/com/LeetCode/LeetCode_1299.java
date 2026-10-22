package com.LeetCode;

import java.util.Scanner;

public class LeetCode_1299 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int []arr = new int[n];
        int max = -1;
        for (int i = arr.length-1; i >=0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
        }
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
