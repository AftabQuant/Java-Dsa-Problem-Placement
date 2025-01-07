package String;
import java.util.*;

public class _4StrMatchingInArray {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if(i!=j && words[i].contains(words[j])) {
                    res.add(words[j]);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
