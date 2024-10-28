package ArraysAndHashing;

public class _4NextSmallerElement {
    static void print(int[] arr){
        for(int ele : arr)System.out.print(ele+" ");
        System.out.println();
    }
    static int[] replaceElement(int[] arr){
        if(arr.length == 1) return new int[]{-1};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;
        int max = arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i] = max;
            max = Math.max(arr[i], max);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {17, 18, 5,4,6,1};
        int[] ans = replaceElement(arr);
        print(ans);
    }
}
