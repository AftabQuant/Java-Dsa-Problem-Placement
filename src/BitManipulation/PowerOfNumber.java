package BitManipulation;

public class PowerOfNumber {
    public static void power(int base, int pow) {
        int total = 0;
        if(pow%2==0) {
            total = (base * (pow/2)) * (base * (pow/2));
        }
        else {
            total = (base * (pow/2)) * (base * (pow/2)) * base;

        }
        System.out.println(total);
    }

    public static void power2(int n) {
        System.out.println(1 << n);
    }
    public static void main(String[] args) {
        power(2, 2);
        power2(4);
    }
}
