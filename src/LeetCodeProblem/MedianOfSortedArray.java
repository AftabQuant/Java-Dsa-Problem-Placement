package LeetCodeProblem;

public class MedianOfSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int i=0, j=0, k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] <= nums2[j]) res[k++] = nums1[i++];
            else res[k++] = nums2[j++];
        }
        while(i<nums1.length) res[k++] = nums1[i++];
        while(j<nums2.length) res[k++] = nums2[j++];
        if(res.length%2 == 0) {
            double a = res[res.length/2];
            double b = res[res.length/2 - 1];
            return (a+b)/2;
        }
        else return res[res.length/2];
    }

    public static void main(String[] args) {

    }
}
