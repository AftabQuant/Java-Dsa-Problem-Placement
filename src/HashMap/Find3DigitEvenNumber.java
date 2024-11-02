package HashMap;
import java.util.*;

public class Find3DigitEvenNumber {
    public static int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : digits){
            if(map.containsKey(ele)) map.put(ele, map.get(ele)+1);
            else map.put(ele, 1);
        }
        for(int i=100; i<1000; i++){
            int x = i;
            int c = x%10; x/=10;
            int b = x%10; x/=10;
            int a = x%10;
            if(map.containsKey(a)){
                int freq = map.get(a);
                map.put(a, map.get(a)-1);
                if(freq==1) map.remove(a);
                if(map.containsKey(b)){
                    int freq2 = map.get(b);
                    map.put(b, map.get(b)-1);
                    if(freq2 ==1) map.remove(b);
                    if(map.containsKey(c)){
                        arr.add(i);
                    }
                    map.put(b, freq2);
                }
                map.put(a,freq);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,0};
        int[] ans = findEvenNumbers(arr);
        for(int ele: ans) System.out.print(ele+", ");
        System.out.println();
    }
}
