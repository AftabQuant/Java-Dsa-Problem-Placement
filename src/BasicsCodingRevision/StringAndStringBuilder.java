package BasicsCodingRevision;
import java.util.*;

public class StringAndStringBuilder {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else map1.put(ch, 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }
            else map2.put(ch, 1);
        }

        for(char ch : map1.keySet()) {
            int frq1 = map1.get(ch);
            if(!map2.containsKey(ch)) return false;
            int frq2 = map2.get(ch);
            if(frq1 != frq2) return false;
        }
        return true;
    }

    public static void print_allSubString(String s) {
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void update_even_position(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++) {
            if(i%2 == 0) str+='a';
            else str += s.charAt(i);
        }
        System.out.println(str);
    }

    public static void count_vowels(String s) {
        int cnt = 0;
        String ss = s.toLowerCase();
        for(int i=0; i<ss.length(); i++) {
            char ch = ss.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmmop";
        update_even_position(s);

    }
}
