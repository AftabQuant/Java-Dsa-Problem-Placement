package String;

public class _3MinOperationToMoveBall {
    public int[] minOperations1(String box) {
        int n = box.length();
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            int sum = 0;
            if(box.charAt(i)=='1') {
                for(int j=0; j<n; j++) {
                    if(i!=j && box.charAt(j)!='0'){
                        int diff = Math.abs(j-i);
                        sum +=diff;
                    }
                }
            }
            else {
                for(int j=0; j<n; j++) {
                    if(box.charAt(j)!='0') {
                        int dif = Math.abs(j-i);
                        sum +=dif;
                    }

                }
            }
            res[i] = sum;
        }
        return res;
    }
    public int[] minOperations(String b) {
        int n = b.length();
        int[] ans = new int[n];
        int lb=0, rb=0, lm=0, rm=0;
        for(int i=0; i<n; i++) {
            ans[i] +=lm;
            lb += Character.getNumericValue(b.charAt(i));
            lm +=lb;
            int j=n-1-i;
            ans[j] +=rm;
            rb +=Character.getNumericValue(b.charAt(j));
            rm +=rb;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
