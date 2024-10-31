package ArraysAndHashing;

import java.util.HashSet;

public class MaximumStringPair{
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words){
        HashSet<String> set = new HashSet<>(); int count = 0;
        for(String ele : words){
            if(set.contains(ele)) count++;
            set.add(ele);
            set.add(reverse(ele));
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
