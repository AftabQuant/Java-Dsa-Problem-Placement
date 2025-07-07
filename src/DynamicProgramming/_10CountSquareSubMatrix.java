package DynamicProgramming;

public class _10CountSquareSubMatrix {
    public static int countSquare(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                if(arr[i][j]==1 && arr[i-1][j-1]>=1 && arr[i-1][j]>=1 && arr[i][j-1]>=1) {
                    arr[i][j] += Math.min(Math.min(arr[i-1][j-1], arr[i-1][j]), arr[i][j-1]);
                }
            }
        }
        int sum = 0;
        for(int[] rows : arr) {
            for(int ele : rows) {
                sum += ele;
            }
        }
        return sum;
    }
}
