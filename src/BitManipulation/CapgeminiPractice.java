package BitManipulation;

public class CapgeminiPractice {
    public static boolean iskThSet(int n, int k) {
        int bitmask = 1 << k;
        return (n & bitmask) != 0;
    }

    public static int isSingle(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void turnOnKthBit(int n, int k) {
        int bit = 1 << k;
        int ans = n | bit;
        System.out.println(ans);
    }

    public static int turnOffRightmostBit(int num) {
        int b = num; int k = 0;
        while(b%2 == 0) {
            b = b >> 1;
            k++;
        }
        int mask = ~(1 << k);
        System.out.println(num & (num-1));
        return num & mask;
    }
    public static void main(String[] args) {
        System.out.println(iskThSet(43,0));

        int[] er = {1,2,2,3,3,4,4};
        System.out.println(isSingle(er));

        turnOnKthBit(5, 1);
        System.out.println(turnOffRightmostBit(43));
    }
}
