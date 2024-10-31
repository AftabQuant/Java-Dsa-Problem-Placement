package ArraysAndHashing;

import java.util.HashSet;

public class DistinctInteger{
    public static int reverse(int ele){
        int rev = 0;
        while(ele>0){
            rev = rev*10 + ele%10;
            ele /= 10;
        }
        return rev;
    }
    public static int countDistinctIntegers(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
            set.add(reverse(ele));
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] ar = {12,32, 56, 78};
        System.out.println(countDistinctIntegers(ar));
    }
}
