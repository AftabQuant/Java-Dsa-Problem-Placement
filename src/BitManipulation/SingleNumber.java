package BitManipulation;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int ele : nums) {
            num ^= ele;
        }
        return num;
    }
    public static void main(String[] args) {

    }
}
