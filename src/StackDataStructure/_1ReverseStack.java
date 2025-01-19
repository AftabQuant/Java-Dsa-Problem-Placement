package StackDataStructure;

import java.util.*;

public class _1ReverseStack {
    public static void reverseRecursively(Stack<Integer> st, Stack<Integer> rev) {
        if(st.isEmpty()) return;
        int top = st.pop();
        rev.push(top);
        reverseRecursively(st,rev);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); st.push(2);
        st.push(3); st.push(4);
        st.push(5); st.push(6);
        System.out.println(st);
        Stack<Integer> rev = new Stack<>();
        while(!st.isEmpty()) rev.push(st.pop());
        System.out.println(rev);
        reverseRecursively(st,rev);
        System.out.println(rev);
        System.out.println(st);

    }
}
