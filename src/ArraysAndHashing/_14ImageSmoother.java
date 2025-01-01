package ArraysAndHashing;

public class _14ImageSmoother {
    int[][] dir = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1}, {0,0}, {0,1},
            {1,-1}, {1,0}, {1,1}
    };
    int m,n;
    public int smoother(int[][] img, int i, int j) {
        int sum = 0, count = 0;
        for(int[]d : dir) {
            int lo = i + d[0];
            int hi = j + d[1];
            if(lo<0 || hi<0 || lo>=m || hi>=n) continue;
            sum +=img[lo][hi];
            count++;
        }
        return sum/count;
    }
    public int[][] imageSmoother(int[][] img) {
        m = img.length; n = img[0].length;
        int[][] output = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                output[i][j] = smoother(img, i, j);
            }
        }
        return output;
    }
}
