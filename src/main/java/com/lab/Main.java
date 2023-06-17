package com.lab;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] A = { 1, 5, 3, 7, 2 };
        int[] B = { 4, 9, 6 };
        int N = A.length;
        int M = B.length;

        Integer[] C = new Integer[N + M];
        int i = 0;

        for (int a : A) {
            C[i++] = a;
        }
        for (int b : B) {
            C[i++] = b;
        }

        Arrays.sort(C, Collections.reverseOrder());
        System.out.println(Arrays.toString(C));
    }
}