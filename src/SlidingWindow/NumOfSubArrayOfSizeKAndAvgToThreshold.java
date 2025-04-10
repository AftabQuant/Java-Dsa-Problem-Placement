package SlidingWindow;

public class NumOfSubArrayOfSizeKAndAvgToThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0; int sum =0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }
        if(sum/k >= threshold) count++;
        int i=1; int j=k;
        while(j<arr.length) {
            sum = sum - arr[i-1] + arr[j];
            if(sum/k >= threshold) count++;
            i++; j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(nums, 3, 4));
    }
}
