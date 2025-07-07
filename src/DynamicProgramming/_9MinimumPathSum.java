package DynamicProgramming;

public class _9MinimumPathSum {
    public static int prefixSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int j=1; j<col; j++) grid[0][j] += grid[0][j-1];
        for(int i=1; i<row; i++) grid[i][0] += grid[i-1][0];
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        int n = grid.length - 1;
        return grid[row-1][col-1];
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
