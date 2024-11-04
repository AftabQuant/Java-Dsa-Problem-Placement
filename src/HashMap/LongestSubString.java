package HashMap;

import java.util.HashMap;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j= 0; int maxLen = 0;
        while (j<s.length()){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=i){
                int len = j-i;
                while (s.charAt(i) != s.charAt(j)) i++;
                maxLen = Math.max(len, maxLen);
                map.put(s.charAt(j), i);
                i++;
            }
            else{
                map.put(s.charAt(j), j);
                j++;
            }
        }
        int len = j-i;
        maxLen = Math.max(len,maxLen);
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
