package SortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    static void mergerSort(int[] arr) {
        if(arr.length==1) return;
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
        for(int i=0; i<mid; i++) left[i] = arr[i];
        for(int j=mid; j<arr.length; j++) right[j-mid] = arr[j];
        mergerSort(left);
        mergerSort(right);
        merge(left, right, arr);
    }
    static int[] merge(int[] ar, int[] br, int[] cr) {
        int i=0; int j=0; int k=0;
        int n = ar.length; int m = br.length;
        while(i<n && j<m){
            if(ar[i]<br[j]) cr[k++] = ar[i++];
            else cr[k++] = br[j++];
        }
        while(i <n) cr[k++] = ar[i++];
        while(j <m) cr[k++] = br[j++];
        return cr;
    }
    static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        mergerSort(a);
        System.out.println(Arrays.toString(a));
    }
}
