package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;

public class _15CountVowelStringInRange {
    public boolean iSVowel(String s) {
        boolean flag = false; int n = s.length()-1;
        if(s.charAt(0)=='a'|| s.charAt(0)=='e'|| s.charAt(0)=='i'|| s.charAt(0)=='o'|| s.charAt(0)=='u') {
            if(s.charAt(n)=='a'|| s.charAt(n)=='e'|| s.charAt(n)=='i'|| s.charAt(n)=='o'|| s.charAt(n)=='u') {
                flag = true;
            }
        }
        return flag;
    }
    public int[] vowelStrings1(String[] s, int[][] queries) {
        int n = queries.length; int m = queries[0].length-1;
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            int count = 0;
            int lo = queries[i][0];
            int hi = queries[i][m];
            for(int j = lo; j<=hi; j++) {
                String word = s[j];
                boolean flag = iSVowel(word);
                if(flag) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
    public int[] vowelStrings(String[] s, int[][] queries) {
        int n = s.length;
        int[] pre = new int[n+1];
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0; i<n; i++) {
            pre[i+1] = pre[i]; // Cumulative Sum
            if(vowel.contains(s[i].charAt(0)) && vowel.contains(s[i].charAt(s[i].length()-1))) pre[i+1]++;
        }
        int[] ans = new int[queries.length]; int m = queries[0].length-1;
        for(int i=0; i<ans.length; i++) {
            ans[i] = pre[queries[i][m]]- pre[queries[i][0]];
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
