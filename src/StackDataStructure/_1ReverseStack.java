package StackDataStructure;

import java.util.*;

public class _1ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); st.push(2);
        st.push(3); st.push(4);
        st.push(5); st.push(6);
        System.out.println(st);
        Stack<Integer> rev = new Stack<>();
        while(!st.isEmpty()) rev.push(st.pop());
        System.out.println(rev);
    }
}
