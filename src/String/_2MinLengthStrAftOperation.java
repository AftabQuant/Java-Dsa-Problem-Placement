package String;

import java.util.HashMap;

public class _2MinLengthStrAftOperation {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else map.put(s.charAt(i), 1);
        }
        int count = 0;
        for(char key: map.keySet()) {
            int freq = map.get(key);
            while(freq>=3){
                freq -=2;
            }
            count +=freq;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
