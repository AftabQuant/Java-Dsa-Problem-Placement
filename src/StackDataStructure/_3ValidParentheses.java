package StackDataStructure;
import java.util.*;

public class _3ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(') st.push(')');
            else if(ch=='{') st.push('}');
            else if(ch=='[') st.push(']');
            else{
                if(st.isEmpty() || st.pop()!=ch) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {

    }
}
