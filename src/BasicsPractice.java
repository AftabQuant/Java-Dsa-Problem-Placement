import java.util.*;

public class BasicsPractice {
    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0 && j % 2 != 0) System.out.print(1 + " ");
                else if (i % 2 == 0 && j % 2 != 0) System.out.print(0 + " ");
                else if (i % 2 == 0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 ||  j == 1 || i == n || j == n ) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static boolean primeNumber(int n){
        if(n==0 || n==1) return false;
        for(int i=2; i<n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i!=j && words[i].contains(words[j])) res.add(words[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(primeNumber(i)) System.out.print(i + " ");
        }
    }
}
