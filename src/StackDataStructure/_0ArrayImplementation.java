package StackDataStructure;

class Stacks {
    int idx=0;
    private int[] arr = new int[6];
    void push(int val) {
        arr[idx++] = val;
    }
    int pop(){
        int top = arr[idx-1];
        arr[idx-1] = 0; idx--;
        return top;
    }
    int peek() {
        return arr[idx-1];
    }
    void print(){
        for(int i=0; i<idx; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    int size() {
        return idx;
    }
}
public class _0ArrayImplementation {
    public static void main(String[] args) {
        Stacks st = new Stacks();
        st.push(1); st.push(2);
        st.push(3); st.push(4);
        st.push(5); st.push(6);
        st.print();
        System.out.println(st.pop());
        st.print();
        System.out.println(st.size());
        System.out.println(st.peek());
    }

}
