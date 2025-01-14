package PrefixSum;
import java.util.*;

public class _7PrefixCommonArray {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        int[] freq = new int[a.length+1];
        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(++freq[a[i]]==2) count++;
            if(++freq[b[i]]==2) count++;
            c[i] = count;
        }
        return c;
    }

    public static void main(String[] args) {

    }
}
