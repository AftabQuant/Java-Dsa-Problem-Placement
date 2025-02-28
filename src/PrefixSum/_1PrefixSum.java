package PrefixSum;

import java.util.Arrays;

public class _1PrefixSum {
    public static int[] algorithm(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
