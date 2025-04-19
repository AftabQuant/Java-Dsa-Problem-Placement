package String;

public class _11LongestSubString {
    public static int countLength(String s, String t) {
        if(s.contains(t)) return t.length();
        else return 0;
    }

    public static void main(String[] args) {
        String s = "abc"; String t = "abc";
        System.out.println(countLength(s, t));
    }
}
