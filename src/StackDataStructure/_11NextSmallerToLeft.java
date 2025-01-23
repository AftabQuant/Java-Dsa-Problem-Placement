package StackDataStructure;

import java.util.Stack;

public class _11NextSmallerToLeft {
    private static void nextSmaller(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            int min = -1;
            for(int j=i-1; j>=0; j--) {
                if(arr[j]<arr[i]){
                    min = arr[j];
                    break;
                }
            }
            ans[i] = min;
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
    }
    private static void nextSmallerToLeft(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++) {
            if(st.isEmpty()) ans[i] = -1;
            else if(arr[i]>st.peek()) ans[i] = st.peek();
            else if(arr[i]<st.peek()) {
                while(!st.isEmpty() && st.peek()>arr[i]) st.pop();
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        nextSmaller(arr);
        System.out.println();
    }
}
