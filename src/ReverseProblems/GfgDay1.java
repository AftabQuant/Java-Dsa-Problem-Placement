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
                int buy = prices[i];
                profit = sell - buy;

            }
        }
        return profit;
    }
    static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};

        System.out.println(maxProfit(arr));

    }
}
