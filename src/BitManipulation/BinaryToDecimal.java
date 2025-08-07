package BitManipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while(num>0) {
            int rem = num%10;
            decimal = decimal + rem * (int) Math.pow(2,power++);
            num /= 10;
        }
        System.out.println(decimal);
    }
}
