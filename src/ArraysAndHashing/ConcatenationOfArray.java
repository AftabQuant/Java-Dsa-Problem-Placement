package ArraysAndHashing;

public class ConcatenationOfArray{
    static void print(int[] arr){
        for(int ele : arr)System.out.print(ele+" ");
        System.out.println();
    }
    public static int[] concatenation(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*arr.length];
        for(int i=0; i<ans.length; i++){
            if(i>=n) ans[i] = arr[i-n];
            else ans[i] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ar = {1,2,1,4};
        int[] ans = concatenation(ar);
        print(ans);
    }
}
