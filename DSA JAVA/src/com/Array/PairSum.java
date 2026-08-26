package com.arrays;

public class PairSum {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        //doubleCount(arr,target);
        System.out.println(doubleCount(arr , target));
        System.out.println(tripleCount(arr, target));
    }

    public static int tripleCount(int arr[], int target){
        int tripleCount = 0;
        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j< arr.length; j++){
                for(int k = j+1; k< arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        tripleCount++;
                    }
                }
            }
        }
        return tripleCount;
    }
    public static int doubleCount(int arr[], int target){
        int doublecount = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]+arr[j]==target){
                    doublecount++;
                }
            }
        }
        return doublecount;


    }
}