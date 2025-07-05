package LeetCodeProblem;
import java.util.*;

public class FindLuckyInteger {
    public static int findLucky(int[] arr) {
        int maxFreq = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : arr) {
            if(map.containsKey(ele)) map.put(ele, map.get(ele) +1);
            else map.put(ele, 1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(key == freq) {
                maxFreq = Math.max(maxFreq, key);
            }
        }
        return maxFreq;
    }

    public static void main(String[] args) {

    }
}
