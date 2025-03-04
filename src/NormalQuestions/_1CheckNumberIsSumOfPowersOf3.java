package NormalQuestions;

public class _1CheckNumberIsSumOfPowersOf3 {
    public static boolean checkPowersOfThree(int n) {
        while(n>0){
            int rem = n%3;
            n /= 3;
            if(rem>1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }

}
