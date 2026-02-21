package PrefixSum.RevisionDay1;

public class PrefixSum {
    public static void printPrimeNumber(int n){
        for(int i=2; i<=n; i++) {
            boolean flag = false;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.print(i + " ");
            }
        }

    }

    public static void isPrimeNumber(int num) {
        if(num <=1) {
            System.out.println("Not Prime Number!");
            return;
        }
        for(int i=2; i<=num; i++) {
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0){
                    System.out.println("Not Prime Number!");
                    return;
                }
            }
        }
        System.out.println("Prime Number!");
        return;
    }

    public static void main(String[] args) {
        printPrimeNumber(100);
        System.out.println();
        isPrimeNumber(11);
    }
}
