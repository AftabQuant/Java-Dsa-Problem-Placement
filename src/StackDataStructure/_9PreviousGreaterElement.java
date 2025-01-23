package StackDataStructure;

import java.util.Stack;

public class _9PreviousGreaterElement {
    private static void previousGreater(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        ans[0] = -1;
        for(int i=1; i<arr.length; i++) {
            while(!st.isEmpty() && st.peek()<arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        for(int ele: ans) {
            System.out.print(ele+" ");
        }
    }
    private static void nextGreaterToLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(st.isEmpty()) ans[i] = -1;
            else if(!st.isEmpty() && st.peek()>=arr[i]) ans[i] = st.peek();
            else if(!st.isEmpty() && st.peek() <=arr[i]){
                while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
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
        int[] arr = {3,10,4,2,1,6,1,7,2,9};
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        nextGreaterToLeft(arr);
        System.out.println();
    }
}
