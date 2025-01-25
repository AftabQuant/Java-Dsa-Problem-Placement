package StackDataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class _13MaximalRectangle {
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
    public int MAH(int[] heights) {
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
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        if(n==0) return 0;
        int m = matrix[0].length;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = matrix[0][i] - '0';
        int max = MAH(arr);
        for(int i=1; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == '0') arr[j] = 0;
                else arr[j] += matrix[i][j] -'0';
            }
            max = Math.max(max,MAH(arr));
        }
        return max;
    }
}
