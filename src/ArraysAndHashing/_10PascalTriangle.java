package ArraysAndHashing;
import java.util.*;

public class _10PascalTriangle {
    public static void print(List<List<Integer>> arr){
        System.out.println(arr);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j>0 && res.get(i-1).size()-1>=j){
                    list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                } else{
                    list.add(1);
                }
            }
            res.add(list);
        }

        return res;
    }
//    public static int[][] generate(int n){
//        int[][] ans = new int[n][];
//        for(int i=0; i<5; i++){
//            ans[i] = new int[i+1];
//            ans[i][0] = 1;
//            ans[i][i] = 1;
//            for(int j=1; j<i; j++){
//                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
//            }
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Rows : ");
        int n = sc.nextInt();
        List<List<Integer>> ans = generate(n);
        System.out.println(ans);
    }
}
