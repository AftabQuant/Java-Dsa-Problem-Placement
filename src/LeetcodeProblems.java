import java.util.HashMap;
import java.util.Map;

public class LeetcodeProblems {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; int j=n-1; int k = m+n-1;
        while(i>=0 && j>=0) {
            if(nums1[i]>=nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        while(i>=0) nums1[k--] = nums1[i--];
        while(j>=0) nums1[k--] = nums2[j--];
    }
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int rem = target - nums[i];
            if(map.containsKey(rem)) {
                res[0] = i;
                res[1] = map.get(rem);
            }
            else map.put(nums[i], i);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
