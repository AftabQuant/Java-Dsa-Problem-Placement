package StackDataStructure;
import java.util.*;

public class _4RemoveConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(st.isEmpty() || st.peek()!=arr[i]) st.push(arr[i]);
            else if (st.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1]) st.pop();
                }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }
        System.out.println(ans.reversed());
    }
}
