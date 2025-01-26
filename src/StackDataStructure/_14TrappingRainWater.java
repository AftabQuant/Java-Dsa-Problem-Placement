package StackDataStructure;

public class _14TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int n = height.length;
        int[] ml = new int[n];
        int[] mr = new int[n];
        int sum = 0;
        ml[0] = height[0];
        for(int i=1; i<n; i++) {
            ml[i] = Math.max(height[i], ml[i-1]);
        }
        mr[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            mr[i] = Math.max(height[i], mr[i+1]);
        }
        for(int i=0; i<height.length; i++) {
            int val = Math.min(ml[i], mr[i]) - height[i];
            sum += val;
        }

        return sum;
    }
    public static void main(String[] args) {
    }
}
