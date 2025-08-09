package BitManipulation;

public class AllQuestions {
    public static int powerOf2(int b) {
        return 1 << b;
    }
    public static void swapTwoNumber(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Aftab swap: " + x + " and " + y);
    }
    public static boolean isSet(int number) {
        int mask = 1 << 3;

    }
    public static void main(String[] args) {
        System.out.println("The power of 2: " + powerOf2(4));
        System.out.println("Befor swap: " + 5 + " and " + 8);
        swapTwoNumber(5,8);
    }
}
