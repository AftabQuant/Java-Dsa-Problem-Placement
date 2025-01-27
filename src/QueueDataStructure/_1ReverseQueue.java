package QueueDataStructure;
import java.util.*;

public class _1ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        q.add(5); q.add(6); q.add(7); q.add(8);
        System.out.println(q);
        while(!q.isEmpty()) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        System.out.println(q);
    }
}
