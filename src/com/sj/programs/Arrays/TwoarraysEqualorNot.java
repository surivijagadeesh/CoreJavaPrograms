package com.sj.programs.Arrays;

public class TwoarraysEqualorNot {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 4};
        boolean arraysEqual = true;
        // First, check if lengths are different
        if (a.length != b.length) {
            arraysEqual = false;
        } else {
            // If lengths are the same, check each element
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    arraysEqual = false;
                    break;
                }
            }
        }
        if (arraysEqual) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}

