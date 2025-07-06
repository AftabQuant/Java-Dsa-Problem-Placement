package DynamicProgramming;

public class _9MinimumPathSum {
    public static int prefixSum(int[][] arr) {
        for(int i=0; i<1; i++){
            for(int j=1; j<arr[0].length; j++) {
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
        for(int i=0; i<1; i++) {
            for(int j=1; j<arr.length; j++) {
                arr[j][i] = arr[j][i] + arr[j-1][i];
            }
        }
        for(int i=1; i<arr.length; i++) {
            for(int j=1; j<arr[0].length; j++) {
                arr[i][j] = arr[i][j] + Math.min(arr[i-1][j], arr[i][j-1]);
            }
        }
        int n = arr.length-1;
        return arr[n][arr[0].length - 1];
    }

    public static void print(int[][] arr) {
        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        print(arr);
        System.out.println(prefixSum(arr));
    }
}
