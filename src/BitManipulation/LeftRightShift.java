package BitManipulation;

import java.util.Scanner;

public class LeftRightShift {
    public static void rightShift(int num) {
        System.out.println(num >> 2);
    }

    public static void leftShift(int num) {
        System.out.println(num << 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        rightShift(n);
        leftShift(n);
    }
}
