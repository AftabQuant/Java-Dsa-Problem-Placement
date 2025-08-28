package BasicsCodingRevision;

import java.util.Scanner;

public class ArrayAndArrayList {
    public static void reverse(int[] nums) {
        int i=0; int j = nums.length-1;
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }

        for(int ele : nums) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swapFunc(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sort_0_1_2(int[] nums) {
        int lo = 0; int mid = 0; int hi = nums.length-1;
        while(mid < hi) {
            if(nums[mid]==0) {
                swapFunc(nums, lo, mid);
                lo++; mid++;
            }
            else if(nums[mid]==1) mid++;
            else if(nums[mid]==2) {
                swapFunc(nums, mid, hi);
                hi--;
            }
        }
    }

    public static void next_greatest_element(int[] nums) {
        int n = nums.length;
        int max = nums[n-1];
        nums[n-1] = -1;
        for(int i=n-2; i>=0; i--) {
            int ele = nums[i];
            nums[i] = max;
            max = Math.max(ele, max);
        }
    }

    public static int max_2d_array(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for(int row[] : nums) {
            for(int ele : row) {
                max = Math.max(max, ele);
            }
            System.out.println();
        }
        return max;
    }

    public static void add_two_matrix(int[][] a, int[][] b) {
        for(int i =0; i<a[0].length; i++) {
            for(int j=0; j<a.length; j++) {
                a[i][j] += b[i][j];
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};


        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

        add_two_matrix(a, b);

        for(int row[] : a) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
