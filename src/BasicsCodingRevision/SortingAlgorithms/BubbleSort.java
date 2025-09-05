package BasicsCodingRevision.SortingAlgorithms;

public class BubbleSort {
    public static void swapFunc(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void printArray(int[] nums) {
        for(int ele: nums) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    swapFunc(nums, j, j+1);
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }
}
