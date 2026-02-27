import java.util.*;


public class Main {
    static void main(String[] args) {
        long num = 0;
        String s = "01234";
        System.out.println("String to Integer conversation:");
        for(int i=0; i<s.length(); i++) {
            int n = (int) s.charAt(i) - 48;
            System.out.print(n+" ");
        }
    }
}