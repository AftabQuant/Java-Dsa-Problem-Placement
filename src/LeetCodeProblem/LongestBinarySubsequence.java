package LeetCodeProblem;

public class LongestBinarySubsequence {
    public static int longestSubsequence(String s, int k) {
        int n = s.length(); int count = 0;
        long value = 0; int power = 0;
        for (int i = n - 1; i >= 0; i--) {
            int bit = s.charAt(i) - '0';
            if (bit == 0) {
                count++;
            } else {
                if (power < 31) {
                    long add = 1L << power;
                    if (value + add <= k) {
                        value += add;
                        count++;
                    }
                }
            }
            power++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "1001010";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        long sum = 0;
        for(int i=0; i<sb.length(); i++) {
            int ele = sb.charAt(i) - '0';
            sum += (long) (ele * Math.pow(2, i));
        }
        System.out.println(sum);
        System.out.println(sb);
        System.out.println(longestSubsequence(s, 5));
    }
}
