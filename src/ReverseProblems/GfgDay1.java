package ReverseProblems;

import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;

public class GfgDay1 {

    public ArrayList<Integer> findMajority(int[] arr) {

        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        for(int ele : arr) {
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }

        for(int key : map.keySet()) {

        }
        ArrayList<Integer> list = new ArrayList<>();

    return list;

    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx == -1) return;

        int min = Integer.MAX_VALUE;
        int mi = 0;
        for(int i=idx+1; i<n; i++) {
            if(arr[i] > arr[idx]) {
                int diff = arr[i] - arr[idx];
                if(diff < min) {
                    min = arr[i];
                    mi = i;
                }
            }
        }
        swap(arr, idx, mi);
        Arrays.sort(arr, idx+1, n);


    }
    public static int maxProfit(int prices[]) {
        int n = prices.length;
        int sell = prices[n-1];
        int profit = 0;

        for(int i=n-1; i>0; i--) {
            if(prices[i] < prices[i-1]) {
                int total = sell - prices[i];
                profit += total;
                sell = prices[i-1];
            }
            if(i==1) {
                int total = sell - prices[i-1];
                profit += total;
            }
        }
        return profit;
    }
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];

        for(int i=1; i<n; i++) {
            min = Math.min(min, prices[i]);
            int p = prices[i] - min;
            profit = Math.max(profit, p);
        }
        return profit;
    }
    public int missingNumber(int[] arr) {

        Set<Integer> set = new TreeSet<>();

        for(int ele: arr) set.add(ele);

        int res = 0;

        while(true) {
            if(!set.contains(res)) return res;
            res++;
        }
    }
    public static int myAtoi(String s) {

        long res=0; int idx = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') continue;
            if(s.charAt(i) == '-') {
                idx = i;
                break;
            }
        }
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)==' ') continue;
            if(s.charAt(i)<=9) {
                int num = s.charAt(i) - '0';
            }
            res = res * 10 + num;
        }

        System.out.println(res);

        if(s.charAt(idx) != '-' && res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(s.charAt(idx) == '-' && res<Integer.MIN_VALUE) return Integer.MIN_VALUE+1;
        return 0;
    }

    static void main(String[] args) {
        String s = "999999999999";
        System.out.println(myAtoi(s));
    }
}
