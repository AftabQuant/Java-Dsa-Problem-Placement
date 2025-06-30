package LeetCodeProblem;

import java.util.*;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums) {
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        int maxLen = 0;
        for(int key : map.keySet()) {
            if(map.containsKey(key + 1)) {
                int len = map.get(key) + map.get(key + 1);
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
