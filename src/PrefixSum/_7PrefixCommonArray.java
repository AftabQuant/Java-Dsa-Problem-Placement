package PrefixSum;
import java.util.*;

public class _7PrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] c = new int[A.length];
        c[0] = 0;
        for(int i=0; i<A.length; i++) {
            int ele1 = A[i];
            int ele2 = B[i];
            if(map.containsKey(ele1) && map.containsKey(ele2)) {
                c[i] = map.size();
            }
            else {
                map.put(ele1, 1);
                map.put(ele2, 1);
            }
        }
        return c;
    }

    public static void main(String[] args) {

    }
}
