package com.ido85.Debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr={8,-1,199,70,10};
        Arrays.sort(arr);  //排序，从小到大
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
