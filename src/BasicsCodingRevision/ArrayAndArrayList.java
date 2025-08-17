package BasicsCodingRevision;

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
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 1, 2, 0, 0, 2, 1, 0, 2};
        sort_0_1_2(arr);
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
