package ArraysAndHashing;

public class _6LengthOfLastWord{
    public static int wordLength(String s){
        int count = 0;
        int n = s.length(), i = n-1;
        while(s.charAt(i)==' ') i--;
        while(i>=0 && s.charAt(i--)!=' '){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World   ";
        System.out.println(wordLength(s));
    }
}
