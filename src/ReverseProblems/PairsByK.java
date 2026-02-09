package ReverseProblems;
import java.util.*;


public class PairsByK {
    static boolean findPairs(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : arr) {
            if(map.containsKey(ele%k)) map.put(ele%k, map.get(ele%k)+1);
            else map.put(ele%k, 1);
        }

        for(int key : map.keySet()) {
            int freq = map.get(key);
            int num = k - key;
            if(!map.containsKey(num) || !map.get(key).equals(map.get(num))) return false;
        }
        return true;
    }
    static void main(String[] args) {

    }
}
