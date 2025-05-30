package StackDataStructure;
import java.util.*;

public class _11LargestRectangleInHist {
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }
    public int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = nextSmaller(heights);
        int[] pse = prevSmaller(heights);
        int max = 0;
        for(int i=0; i<n; i++){
            int height = heights[i] * (nse[i] - pse[i] -1);
            max = Math.max(max, height);
        }
        return max;
    }
}
