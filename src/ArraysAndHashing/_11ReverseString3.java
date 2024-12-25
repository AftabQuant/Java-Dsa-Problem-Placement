package ArraysAndHashing;

public class _11ReverseString3 {
    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k, n);
            StringBuilder reversed = new StringBuilder(s.substring(i, end)).reverse();
            result.append(reversed);
            if (end < n) {
                int secondPartEnd = Math.min(i + 2 * k, n);
                result.append(s.substring(end, secondPartEnd));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
