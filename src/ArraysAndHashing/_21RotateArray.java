package ArraysAndHashing;

public class _21RotateArray {
    public void swapFunc(int[] arr, int i, int j) {
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = n-1;
        k = k%n;
        swapFunc(nums,i,j);
        swapFunc(nums,i,k-1);
        swapFunc(nums,k,j);
    }
    public static void main(String[] args) {

    }
}
