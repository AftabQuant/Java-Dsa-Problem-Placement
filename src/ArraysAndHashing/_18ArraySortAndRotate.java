package ArraysAndHashing;

import java.util.Arrays;

public class _18ArraySortAndRotate {
    public boolean check(int[] a) {
        int n = a.length;
        int[] b = Arrays.copyOf(a,n);
        Arrays.sort(b);
        int x = -1;
        for(int i=0; i<n-1; i++) {
            if(a[i]>a[i+1]){
                x = i+1;
                break;
            }
        }
        if(x == -1) return true;
        for(int i=0; i<n; i++) {
            if(b[i] != a[(i+x)%n]) return false;
        }
        return true;
    }
}
