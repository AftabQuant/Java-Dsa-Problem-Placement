package ArraysAndHashing;

public class _13MaxScoreAfterSplit {
    public static int maxScore(String s) {
        int max = Integer.MIN_VALUE;
        for(int i=1; i<s.length(); i++){
            int one = 0, zero = 0;
            for(int j=0; j<i; j++) {
                if(s.charAt(j)=='0') zero++;
            }
            for(int j=i; j<s.length(); j++) {
                if(s.charAt(j)=='1') one++;
            }
            int sum = one + zero;
            max = Math.max(sum, max);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
}
