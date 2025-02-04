package ArraysAndHashing;

public class _20MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int Total = 0;
        for(int i=0; i<n; i++) {
            int sum = nums[i];
            for(int j=i+1; j<n; j++) {
                if(nums[j]>nums[j-1]) sum+=nums[j];
                else break;
            }
            Total = Math.max(Total, sum);
        }
        return Total;
    }
    public static void main(String[] args) {

    }
}
