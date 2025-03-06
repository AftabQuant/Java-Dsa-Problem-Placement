package NormalQuestions;

public class _2FindMissingAndRepeatedValue {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] res = new int[2];
        int[] hash = new int[n*n+1];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                hash[grid[i][j]]++;
            }
        }
        for(int i=1; i<=n*n; i++) {
            if(hash[i]==2) res[0] = i;
            if(hash[i]==0) res[1] = i;
        }
        return res;
    }
    public static int missingValue(int[] nums) {
        int n = nums.length+1;
        int ts = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<nums.length; i++) sum+=nums[i];
        return ts - sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(missingValue(nums));
    }
}
