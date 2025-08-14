package BasicsCodingRevision;

public class BitsManipulation {
    public static void twoPowern(int n) {
        System.out.println(1 << n);
    }

    public static void swapNumber(int a, int b) {
        System.out.println("Befor swap: " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: " + a + " " + b);
    }

    public static void isSetKthBit(int num, int bit) {
        int bitmask = 1 << bit;
        int ans = num & bitmask;
        if(ans == 0) System.out.println("Kth bit is not set");
        else System.out.println("Kth bit is set");
    }

    public static void turnOnKthBit(int num, int bit) {
        int bitmask = 1 << bit-1;
        System.out.println(num | bitmask);
    }

    public static void turnOffKthBit(int num, int bit) {
        int bitmask = ~(1 << bit-1);
        System.out.println(num & bitmask);
    }

    public static void toggleKthBit(int num, int bit) {
        int bitmask = 1 << bit-1;
        System.out.println(num ^ bitmask);
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int ele: nums) {
            num ^= ele;
        }
        return num;
    }

    public static void turnOffRightmostBit(int num) {
        int b = num;
        int bit = 0;
        while(b%2 == 0) {
            b = b >> 1;
            bit++;
        }
        int mask = 1 << bit;
        int ans = num ^ mask;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        turnOffRightmostBit(6);
    }
}
