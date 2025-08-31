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

    public static void toggle_character(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            if(ascii >=65 && ascii <=90) {
                ascii += 32;
            }
            else if(ascii >=97 && ascii <=122) {
                ascii -= 32;
            }
            ch = (char) ascii;
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
    }

    public static void reverse(StringBuilder sb, int i, int j) {
        while(i<=j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }

    public static void reverse_each_word(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while(j<s.length()) {
            char ch = s.charAt(j);
            if(ch!=' ') {
                j++;
            }
            else {
                reverse(sb, i, j-1);
                i = j+1;
                j = i;
            }
            sb.append(ch);
        }
        reverse(sb, i, j-1);
        System.out.println(sb);
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            boolean flag = false;
            for(int j=i+1; j<strs.length; j++) {
                char ch1 = strs[j].charAt(i);
                if(ch==ch1) flag = true;
            }
            if(flag) sb.append(ch);
        }

        return sb.toString();

    }

    public static boolean areIsomorphic(String s1, String s2) {
        // code here
        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        for(char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        for(char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }

        for(char key : map1.keySet()) {
            int freq1 = map1.get(key);
            int freq2 = map2.get(key);
            if(freq1 != freq2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "i am aftab uddin and i am a student";
//
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//        for(char h : ch) {
//            System.out.print(h+" ");
//        }

        System.out.println(areIsomorphic("aab", "xxy"));
    }
}
