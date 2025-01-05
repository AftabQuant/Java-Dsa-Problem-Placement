package String;
import java.util.*;

public class _2PalindromeSubsequence {
    public String isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int countPalindromicSubsequence1(String s) {
        ArrayList<String> arr = new ArrayList<>();
        Set<String> set = new HashSet<>();
        findSubsequence(s, 3, 0, new StringBuilder(), arr);
        for (String st : arr) {
            String sv = isPalindrome(st);
            if (s.equals(st)) set.add(st);
        }
        return set.size();
    }
    public int countPalindromicSubsequence(String s) {
        Set<Character> letter = new HashSet<>();
        for(Character ch : s.toCharArray()) {
            letter.add(ch);
        }
        int count = 0;
        for(Character ch : letter) {
            int i = -1;
            int j = 0;
            for(int k =0; k<s.length(); k++) {
                if(s.charAt(k) == ch) {
                    if (i == -1) i = k;
                }
                j = k;
            }
            Set<Character> set = new HashSet<>();
            for(int k = i+1; k<j; k++) {
                set.add(s.charAt(k));
            }
            count+=set.size();
        }
        return count;
    }
    public void findSubsequence(String s, int hi, int lo, StringBuilder sb, List<String> res) {
        if(sb.length()==3) {
            res.add(sb.toString());
            return;
        }
        for(int i=lo; i<s.length(); i++) {
            sb.append(s.charAt(i));
            findSubsequence(s,3,i+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println();
    }
}
