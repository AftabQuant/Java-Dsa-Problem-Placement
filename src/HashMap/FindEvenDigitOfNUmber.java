package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindEvenDigitOfNUmber {
    public static int frequency(int ele){
        int count = 0;
        while(ele>0){
            int rem = ele%10;
            ele /=10;
            count+=1;
        }
        return count;
    }
    public static int findNumbers(int[] nums) {
        int even = 0;
        for(int ele : nums){
            int element = frequency(ele);
            if(element%2 == 0) even+=1;
        }
        return even;
    }

    public static void main(String[] args) {

    }
}
