package com.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,4);
        list.add(4,3);
        list.add(4,69);
        list.add(3,88);
        System.out.println("this given list :"  +list);

        int nums[] = new int [7];
        for(int i=0;i<nums.length;i++){
            nums[i] = list.get(i);
        }
        System.out.println("We have converted the Arraylist into Arrya :- ");
        System.out.println(Arrays.toString(nums));
    }
}
