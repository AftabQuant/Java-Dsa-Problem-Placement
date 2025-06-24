package LeetCodeProblem;
import java.util.*;

public class FindAllKDistantIndicesInAnArray {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for(int i=0; i<nums.length; i++) if(nums[i] == key) index.add(i);

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<index.size(); j++) {
                if(Math.abs(index.get(j) - i) <= k) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

}
