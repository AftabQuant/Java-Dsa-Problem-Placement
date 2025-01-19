package StackDataStructure;

import java.util.*;

public class _2PushElementAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); st.push(2);
        st.push(3); st.push(4);
        st.push(5); st.push(6);
        System.out.println(st);
        System.out.println("Enter an element : ");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        System.out.println("Enter an index : ");
        int idx = sc.nextInt();
        Stack<Integer> rev = new Stack<>();
        while(st.size()>=idx) {
            rev.push(st.pop());
        }
        st.push(ele);
        while(!rev.isEmpty()) {
            st.push(rev.pop());
        }
        System.out.println(st);
    }
}
