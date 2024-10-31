package HashMap;

import java.util.*;

public class ValidAnagram {
    private static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(mp1.containsKey(s.charAt(i))) mp1.put(s.charAt(i), mp1.get(s.charAt(i))+1);
            else mp1.put(s.charAt(i), 1);
        }
        for(int i=0; i<t.length(); i++) {
            if(mp2.containsKey(t.charAt(i))) mp2.put(t.charAt(i), mp2.get(t.charAt(i))+1);
            else mp2.put(t.charAt(i), 1);
        }
        for(char key : mp1.keySet()){
            int val1 = mp1.get(key);
            if(!mp2.containsKey(key)) return false;
            int val2 = mp2.get(key);
            if(val1!=val2) return false;
        }
        return true;
     }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
