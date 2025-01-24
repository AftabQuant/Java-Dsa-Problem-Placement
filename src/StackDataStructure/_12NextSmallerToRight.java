package StackDataStructure;

import java.util.Stack;

public class _12NextSmallerToRight {
    private static void nextSmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--) {
            if(st.isEmpty()) ans[i] = -1;
            else if(st.peek()<=arr[i]) ans[i] = st.peek();
            else if(!st.isEmpty() && st.peek()>=arr[i]) {
                while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
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
