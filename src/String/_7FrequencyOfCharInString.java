package String;

import java.util.HashMap;
import java.util.Map;

public class _7FrequencyOfCharInString {
    public static char mostFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        int max = Integer.MIN_VALUE;
        char ch = s.charAt(0);
        for(char key : map.keySet()) {
            int freq = map.get(key);
            if(freq>max) {
                ch = key;
                max = Math.max(freq, max);
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String s= "aftab";
        System.out.println(mostFrequency(s));
    }
}
