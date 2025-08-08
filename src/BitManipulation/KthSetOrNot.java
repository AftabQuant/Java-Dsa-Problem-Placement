package BitManipulation;

import java.util.Scanner;

public class KthSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the kth bit: ");
        int bit = sc.nextInt();

        int mask = 1 << bit;
        if((number & mask) == 0) System.out.println("Not set");
        else System.out.println("Set");

    }
}
