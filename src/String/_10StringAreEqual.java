package String;

import java.util.Arrays;

public class _10StringAreEqual {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int n = s1.length();
        int lo = -1, hi = -1;
        for(int i=0; i<n; i++) {
            if(s1.charAt(i)!=s2.charAt(i)) {
                if(lo==-1) lo = i;
                else if(hi==-1) hi=i;
                else return false;
            }
        }
        return (hi!=-1 && s1.charAt(lo)==s2.charAt(hi) && s1.charAt(hi)==s2.charAt(lo));
    }
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("abcd", "dcba"));
    }
}
