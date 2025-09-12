package BinarySearch;

public class BinaryS {
    public static int search(int[] nums, int x) {
        int lo = 0, hi = nums.length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == x) return mid;
            else if(nums[mid] > x) hi = mid-1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static void lowerBound(int[] nums, int x) {
        int lo=0, hi = nums.length-1;
        int lb = 0;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] >= x) {
                lb = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(lb);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,9,10};
        System.out.println(search(nums, 5));
        lowerBound(nums, 8);
    }
}
