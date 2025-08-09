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
    public static void iskthSet(int number) {
        int mask = 1 << 3;
        if((number & mask) == 1) System.out.println("the kth bit is set.");
        else System.out.println("the 3rd bit is not set.");
    }
    public static void turnOnKthBit(int num, int k) {
        int mask = 1 << k;
        int result = num | mask;
        System.out.println("After turn on the kth bit: " + result);
    }
    public static void turnOffKthBit(int num, int k) {
        int mask = ~(1 << k);
        int result = num & mask;
        System.out.println("After turn off the kth bit: " + result);
    }
    public static void toggleKthBit(int num, int k) {
        int mask = 1 << k;
        int result = num ^ mask;
        System.out.println("After toggle the kth bit: " + result);
    }
    public static void turnOfRightBit(int num) {
        int b = num;
        int k = 0;
        while(b%2 == 0) {
            b = b >> 1;
            k++;
        }
        int mask = ~(1 << k);
        int ans = num & mask;
        System.out.println("After turn off rightmost bit: " + ans);
    }
    public static void main(String[] args) {
        System.out.println("The power of 2: " + powerOf2(4));
        System.out.println("Befor swap: " + 5 + " and " + 8);
        swapTwoNumber(5,8);
        iskthSet(91);
        turnOnKthBit(91, 3);
        turnOffKthBit(91, 3);
        toggleKthBit(91, 3);
        turnOfRightBit(91);
    }
}
