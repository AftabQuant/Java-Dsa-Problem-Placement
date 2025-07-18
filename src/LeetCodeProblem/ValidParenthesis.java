package LeetCodeProblem;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        if(s.length() <= 1) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(') st.push(')');
            else if(ch=='{') st.push('}');
            else if(ch=='[') st.push(']');
            else if(st.isEmpty() || st.pop() != ch) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
