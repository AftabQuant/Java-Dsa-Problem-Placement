package ArraysAndHashing;

public class _7TwoSum{
    static void print(int[] arr){
        for(int ele: arr) System.out.print(ele+" ");
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,11, 7,15};
        int[] ans = twoSum(arr, 9);
        print(ans);
    }
}
