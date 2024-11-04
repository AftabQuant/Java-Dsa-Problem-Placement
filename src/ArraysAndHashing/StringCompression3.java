package ArraysAndHashing;

public class StringCompression3 {
    public static String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int j = 0, i = 0;
        while(j<word.length()){
            while(j<word.length() && word.charAt(i) == word.charAt(j)) j++;
            int len = j-i;
            while (len>0){
                int rem = Math.min(len, 9);
                sb.append(rem);
                sb.append(word.charAt(i));
                len -=rem;
            }
            i = j;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
}
