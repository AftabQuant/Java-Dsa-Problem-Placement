package BitManipulation;

import java.util.Scanner;

public class TurnOffRightMostBit {

    public static void bestWay(int n) {
        System.out.println(n & (n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        int b = a;
        int k = 0;
        while(b%2==0) {
            b = b >> 1;
            k++;
        }
        int mask = ~(1 << k);
        int ans = a & mask;
        System.out.println(ans);
        bestWay(a);
    }
}
