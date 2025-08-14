package BitManipulation;

public class NumberOfBit1 {
    public static int numberOfBits(int num) {
        int cnt = 0;
        while(num != 0) {
            num = num & (num-1);
            cnt++;
        }
        return cnt;
    }
    public static int numberOfBits1(int num) {
        int cnt = 0;
        for(int i=0; i<32; i++) {
            int mask = 1 << i;
            if((num & mask) != 0) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(numberOfBits(91));
        System.out.println(numberOfBits1(91));
    }
}
