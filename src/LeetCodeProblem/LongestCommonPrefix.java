package LeetCodeProblem;
import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str[0].length(); i++) {
            for(String st : str) {
                if(i==st.length() || st.charAt(i) != str[0].charAt(i)) return sb.toString();
            }
            sb.append(str[0].charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] st = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(st));

        String[] st1 = {"Aftab", "Aftab", "Aftab"};
        System.out.println(longestCommonPrefix(st1));
    }
}
