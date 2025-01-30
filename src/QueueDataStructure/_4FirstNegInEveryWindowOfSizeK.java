package QueueDataStructure;
import java.util.*;

public class _4FirstNegInEveryWindowOfSizeK {
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) if(arr[i]<0) q.add(i);
        for(int i=0; i<=n-k; i++) {
            while(!q.isEmpty() && q.peek()<i) q.remove();
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                list.add(arr[q.peek()]);  // Add the negative value, not index
            } else {
                list.add(0);
            }
        }
        return list;
    }
}
