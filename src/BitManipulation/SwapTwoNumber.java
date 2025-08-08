package BitManipulation;

public class SwapTwoNumber {
    public static void swapNumber(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " +  b);
    }
    public static void main(String[] args) {
        int a = 5, b = 8;
        System.out.println(a + " " + b);
        swapNumber(a, b);

    }
}
