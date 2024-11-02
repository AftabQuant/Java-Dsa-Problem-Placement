package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrence{
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map =new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            set.add(val);
        }
        return map.size()==set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
