package LeetCodeProblem;

import java.util.HashMap;
import java.util.HashSet;

public class DeleteCharactersMakeFancyString {
    public String makeFancyString(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {

            if(i>0 && s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else count = 1;
            if(count <= 2) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
