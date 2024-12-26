package BasicSorting;

public class AllBasicSort {
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
    public static void bubbleSort(int[] ar) {
        for(int i=0; i<ar.length-1; i++){
            boolean flag = false;
            for(int j=i+1; j<ar.length; j++) {
                if(ar[j]<ar[i]) {
                    swapFunc(ar,i,j);
                    flag = true;
                }
            }
            if(!flag) break;
        }
        print(ar);
    }
    public static void insertionSort(int[] ar) {
        for(int i=0; i< ar.length; i++) {
            for(int j=i; j>0; j--) {
                if(ar[j]<ar[j-1]) swapFunc(ar, j, j-1);
            }
        }
        print(ar);
    }
    public static void selectionSort(int[] ar) {
         for(int i=0; i<ar.length-1; i++){
             int min = i;
             for(int j=i+1; j<ar.length; j++) {
                 if(ar[min]>ar[j]) min = j;
             }
             if(i!=min)swapFunc(ar,i,min);
         }
         print(ar);
    }
    public static void mergeArray(int[] ar, int[] a, int[] b) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) ar[k++] = a[i++];
            else ar[k++] = b[j++];
        }
        while(i<a.length) ar[k++] = a[i++];
        while(j<b.length) ar[k++] = b[j++];
    }
    public static void mergeSort(int[] ar) {
        int n = ar.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<a.length; i++) a[i] = ar[i];
        for(int i=0; i<b.length; i++) b[i] = ar[i+n/2];
        mergeSort(a);
        mergeSort(b);
        mergeArray(ar,a,b);
    }



    public static void main(String[] args) {
        int[] ar = {2,5,3,1,4};
        int[] br = {5,4,3,2,1};
        int[] cr = {1,2,3,4,5};
        mergeSort(ar);
//        print(ar);
        mergeSort(br);
//        print(br);
        mergeSort(cr);
//        print(cr);
    }
}
