package com.ido85.learn;

import java.net.SocketOption;

/**
 * 基础练习
 */

public class Demos {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
//        han(10,200000000,5);
        li(20,200,3);
        long b = System.currentTimeMillis();
        System.out.println(b-a);
    }

    static void han(int start, int end, int b) {
        int count = 0, sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % b == 0) {
                count++;
                sum += i;
            }
        }
    }

    static void li(int start, int end, int b) {
        int sum = 0;
        int a = 0;
        int si = start / b;
        if(start %b != 0){
            si ++;
        }
        for (int i = si; b * i <= end; i++) {
            sum = sum + b * i;
            a++;
        }
        System.out.println("i=" + a * b + " a=" + a + " sum=" + sum);
    }
}