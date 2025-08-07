package BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(num>0) {
            int rem = num%2;
            sb.append(rem);
            num /= 2;
        }
        System.out.println(sb.reverse());
    }
}
