package ArraysAndHashing;

public class _12Merge2SortedArray {
    public static void merge(int[] ar, int m, int[] br, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while(i>=0 && j>=0) {
            if(ar[i]>=br[j]){
                ar[k--] = ar[i--];
            }
            else if(ar[i]<=br[j]){
                ar[k--] = br[j--];
            }
        }
    }
    public static void main(String[] args) {

    }
}
