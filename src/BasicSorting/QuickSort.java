package BasicSorting;

public class QuickSort {
    public static void print(int[] ar) {
        for(int ele : ar) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swapFunc(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static int partition(int[] ar, int lo, int hi) {
        int count = 0;
        for(int i=lo+1; i<=hi; i++) {
            if(ar[lo]>=ar[i]) count++;
        }
        int pivot = count+lo;
        swapFunc(ar,lo, pivot);
        while(lo<pivot && hi>pivot) {
            if(ar[lo]<=ar[pivot]) lo++;
            else if(ar[hi]>ar[pivot]) hi--;
            else if(ar[lo]>ar[pivot] && ar[hi]<ar[pivot]) {
                swapFunc(ar,lo,hi);
                lo++;hi--;
            }
        }
        return pivot;
    }
    public static void quickSort(int[] ar, int lo, int hi) {
        if(lo>=hi) return;
        int mid = partition(ar, lo, hi);
        quickSort(ar, lo, mid-1);
        quickSort(ar, mid+1, hi);
    }
    public static void main(String[] args) {
        int[] br = {5,4,3,2,1};
        int[] ar = {2,5,3,1,4};
        print(br);
        quickSort(br,0, br.length-1);
        quickSort(ar,0,ar.length-1);
        print(br);
        print(ar);

    }
}
