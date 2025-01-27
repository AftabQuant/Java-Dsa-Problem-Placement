package QueueDataStructure;

import java.util.*;

public class _2ReverseFirstKElement {
    public static void reverse(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0; i<k; i++) st.push(q.remove());
        while(!st.isEmpty()) qu.add(st.pop());
        while(!q.isEmpty()) qu.add(q.remove());
        System.out.println(qu);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        q.add(5); q.add(6); q.add(7); q.add(8);
        System.out.println(q);
        reverse(q,4);
    }
}
