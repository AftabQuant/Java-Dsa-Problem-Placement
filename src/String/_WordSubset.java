package String;
import java.util.*;

public class _WordSubset {
    public boolean subset(int[] source, int[] dest) {
        for(int i=0; i<26; i++){
            if(dest[i]>source[i]) return false;
        }
        return true;
    }
    public List<String> wordSubsets(String[] w1, String[] w2) {
        List<String> list = new ArrayList<>();
        int[] target = new int[26];
        for(String s2: w2) {
            int[] temp = new int[26];
            for(char ch : s2.toCharArray()) {
                temp[ch-'a']++;
            }
            for(int i=0; i<26; i++) {
                target[i] = Math.max(target[i], temp[i]);
            }
        }
        for(String s1: w1) {
            int[] arr = new int[26];
            for(char ch: s1.toCharArray()){
                arr[ch-'a']++;
            }
            if(subset(arr, target)) list.add(s1);
        }
        return list;
    }
}
