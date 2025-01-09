package String;

public class _8CountWordStartWithPref {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String ele : words) {
            if(ele.startsWith(pref)) count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
