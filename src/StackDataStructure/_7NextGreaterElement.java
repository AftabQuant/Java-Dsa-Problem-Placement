package StackDataStructure;

import java.util.Stack;

public class _7NextGreaterElement {
    private static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
    }
    private static void nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,10,4,2,1,6,1,7,2,9};
        nextGreaterElement(arr);
        System.out.println();
        int n = arr.length;
        arr[n-1] = -1;
        for(int i=0; i<n; i++) {
            int max = -1;
            for(int j=i+1; j<n; j++) {
                if(arr[i]<arr[j]) {
                    max = Math.max(max,arr[j]);
                    break;
                }
            }
            arr[i] = max;
        }
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
