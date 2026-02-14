package PriorityQueue;
import java.util.*;

public class Basic {
    public static void sortKArrays(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new  int[arr.length];
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k){
                res[idx++]=pq.remove();
            }
        }
        while(!pq.isEmpty()){
            res[idx++] = pq.remove();
        }
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int[] arr = new int[matrix.length * matrix[0].length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] row :matrix){
            for(int x:row){
                pq.add(x);
            }
        }
        while(pq.size()>k){
            pq.remove();
        }

        System.out.println(pq.peek());
        return pq.peek();
    }
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] a = {6,5,3,2,8,10,9};
        int[] b = {3,1,4,2,5};
        sortKArrays(a,3);
        sortKArrays(b,2);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : a){
            map.put(ele,1);
        }

    }
}
