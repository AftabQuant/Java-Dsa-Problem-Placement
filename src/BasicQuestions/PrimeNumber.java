package BasicQuestions;
import java.util.*;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i<Math.sqrt(num); i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void primeNumber(int num) {
        for(int i=2; i<=num; i++){
            boolean flag=false;
            for(int j=2; j<Math.sqrt(i); j++) {
                if(i%j==0) flag=true;
            }
            if(!flag) System.out.println(i+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        if(isPrime(1)){
            System.out.println("Prime number.");
        }
        else System.out.println("Not prime number.");

        primeNumber(100);

    }
}
