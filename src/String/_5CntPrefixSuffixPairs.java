package String;

public class _5CntPrefixSuffixPairs {
    public boolean isPrefixAndSuffix(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        return (m>=n && str2.startsWith(str1) && str2.endsWith(str1));
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length, count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                boolean flag = isPrefixAndSuffix(words[i], words[j]);
                if(flag && i<j) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
