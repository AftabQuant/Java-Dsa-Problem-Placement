package ArraysAndHashing;
import java.util.HashSet;

public class ContainDuplicate{
    static boolean isContain(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(ele)) return true;
            else set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4};
        System.out.print(isContain(arr));
    }
}
