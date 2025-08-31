package BasicsCodingRevision;
import java.util.*;

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

    public static int binary_search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
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

    public static void print_wave(int[][] nums) {
        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                for(int j=0; j<nums[0].length; j++) System.out.print(nums[i][j] + " ");
            }
            else for(int j=nums[0].length-1; j>=0; j--) System.out.print(nums[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] transpose_matrix(int[][] arr) {
        int n = arr.length; int m = arr[0].length;
        // Method 1 : brute force
        int[][] tran = new int[m][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                tran[j][i] = arr[i][j];
            }
        }
        // Method 2 : swap method
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static void print_2d(int[][] ar) {
        for(int row[] : ar) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void spiral_printing(int[][] arr) {
        int fr = 0, fc = 0;
        int lr = arr.length-1, lc = arr[0].length-1;
        while(fr <= lr && fc<=lc) {
            for(int j=fc; j<=lc; j++) {
                System.out.print(arr[fr][j]+" ");
            }
            fr++;
            for(int i=fr; i<=lr; i++) {
                System.out.print(arr[i][lc] + " ");
            }
            lc--;
            for(int j=lc; j>=fc; j--) {
                System.out.print(arr[lr][j]+" ");
            }
            lr--;
            for(int i=lr; i>=fr; i--) {
                System.out.print(arr[i][fc] + " ");
            }
            fc++;
        }
    }

    public static void print_2dArrayList(List<List<Integer>> nums) {
        for(int i=0; i<nums.size(); i++) {
            List<Integer> x = nums.get(i);
            for(int j=0; j<x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static List<List<Integer>> pascal_triangle(int n) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<n; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || i==j) list.add(1);
                else list.add(res.get(i-1).get(j) + res.get(i-1).get(j-1));
            }
            res.add(list);
        }
        return res;
    }

    public static int getMaxOccurance(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        int freq = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;

        for(int key : map.keySet()) {
            int count = map.get(key);
            System.out.println(key + " " + map.get(key));
            if(count >= freq) {
                freq = count;
                res = key;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};

        int[] br = {1,2,1,3,4,3,1,3,4};
        System.out.println(getMaxOccurance(br));

        // 2-D Array :
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

        // 1-D ArrayList :
        List<Integer> x = new ArrayList<>();
        x.add(10); x.add(20); x.add(30); x.add(40);
        List<Integer> y = new ArrayList<>();
        y.add(10); y.add(20); y.add(30);
        List<Integer> z = new ArrayList<>();
        z.add(10); z.add(20);

        // 2-D ArrayList :
        List<List<Integer>> list = new ArrayList<>();
        list.add(x) ; list.add(y); list.add(z);

        List<List<Integer>> nums = pascal_triangle(5);

        int[] arrr = {1,2,3,4,5,6};
    }
}
