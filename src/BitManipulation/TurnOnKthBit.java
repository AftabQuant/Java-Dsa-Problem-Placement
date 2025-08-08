package BitManipulation;

import java.util.Scanner;

public class TurnOnKthBit {
    public static boolean kthBit(int num, int bit) {
        int b = num >> bit;
        return b%2 == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the kth bit: ");
        int bit = sc.nextInt();

        int mask = 1 << bit;
        if((number|mask) == number) {
            System.out.println("same");
        }
        else {
            System.out.println("Not same");
        }

        System.out.println(kthBit(number, bit));
    }
}
