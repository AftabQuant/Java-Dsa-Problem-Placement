package StackDataStructure;

import java.util.Stack;

public class _6RemoveAdjInStr {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch) st.push(ch);
            else if(st.peek()==ch) st.pop();
            }
            while(!st.isEmpty()) {
                sb.append(st.pop());
            }
        return sb.reverse().toString();
    }
}
