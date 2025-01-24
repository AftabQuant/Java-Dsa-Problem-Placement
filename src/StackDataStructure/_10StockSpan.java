package StackDataStructure;
import java.util.*;

class StockSpanner {
    Stack<Integer> st;
    List<Integer> list;
    public StockSpanner() {
        list = new ArrayList<>();
        st = new Stack<>();
    }
    public int next(int price) {
        list.add(price);
        while(!st.isEmpty() && list.get(st.peek())<=price) st.pop();
        int prev = st.isEmpty()? -1:st.peek();
        int curr = list.size()-1;
        int res = curr - prev;
        st.push(curr);
        return  res;
    }
}
public class _10StockSpan {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
            while(!st.isEmpty() && list.get(st.peek())<=arr[i]) st.pop();
            int prev = st.isEmpty() ? -1 : st.peek();
            int res = i - prev;
            st.push(i);
            ans.add(res);
        }
        return ans;
    }
}
