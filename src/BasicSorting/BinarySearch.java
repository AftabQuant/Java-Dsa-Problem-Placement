package BasicSorting;

public class BinarySearch {
    public static int search(int[] arr, int ele) {
        int i=0, j=arr.length-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr[mid]==ele) return mid;
            else if(arr[mid]>ele) j = mid-1;
            else i = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};
        System.out.println(search(ar,3));
    }
}
