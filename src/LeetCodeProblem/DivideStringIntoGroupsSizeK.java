package LeetCodeProblem;

import java.util.*;

public class DivideStringIntoGroupsSizeK {
    public String[] divideString(String s, int k, char fill) {
        int j = 0;
        List<String> res = new ArrayList<>();
        while(j<s.length()) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<k; i++) {
                if(j<s.length()){
                    sb.append(s.charAt(j));
                    j++;
                }
                else sb.append(fill);
            }
            res.add(sb.toString());
        }
        return res.toArray(new String[0]);
    }
    public static void main(String[] args) {

    }
}
