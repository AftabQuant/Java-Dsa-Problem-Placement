package NormalQuestions;

class SparceVector {
    int[] ar;
    public  SparceVector(int[] ar) {
        this.ar = ar;
    }
    public int dotProduct(SparceVector v2) {
        int result = 0;
        for(int i=0; i<ar.length; i++) {
            result += this.ar[i]*v2.ar[i];
        }
        return result;
    }
}
public class _3DotProduct {
    public static void main(String[] args) {
        int[] nums1 = {1, 0, 0, 2, 3};
        int[] nums2 = {0, 3, 0, 4, 0};
        SparceVector v1 = new SparceVector(nums1);
        SparceVector v2 = new SparceVector(nums2);
        System.out.println(v1.dotProduct(v2));

    }
}
