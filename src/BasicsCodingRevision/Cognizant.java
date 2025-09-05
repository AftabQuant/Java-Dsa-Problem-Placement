package BasicsCodingRevision;

import java.util.Arrays;
import java.util.*;


public class Cognizant {
    public static void countDistinctString(int n, Scanner sc) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<=n; i++) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            set.add(str);
        }
        System.out.println(set.size()-1);
    }

    public static void fibonacciSeries(int n) {
        int a = 0; int b = 1; int sum = 0;
        for(int i=0; i<n; i++) {
            System.out.print(a + " ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }

    public static boolean isSortedArray(int[] b) {
        for(int i=0; i<b.length-1; i++) {
            if(b[i] >= b[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] res = {1,2,6,4,5};
        System.out.println(isSortedArray(res));

    }
}
