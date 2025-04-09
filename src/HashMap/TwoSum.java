package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] arr, int target){
        int[] ans = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)) {
                ans[0] = i;
                ans[1] = map.get(rem);
                return ans;
            }
            else map.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}
