package BitManipulation;

import java.util.Scanner;

public class TurnOffKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the kth bit: ");
        int bit = sc.nextInt();

        int mask = ~(1 << bit);
        if((number&mask) == number) {
            System.out.println("Off");
        }
        else {
            System.out.println("On");
        }
    }
}
