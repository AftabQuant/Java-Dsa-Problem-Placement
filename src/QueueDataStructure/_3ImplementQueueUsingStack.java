package QueueDataStructure;
import java.util.*;

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }
    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        while(in.size()>1) out.push(in.pop());
        int top = in.pop();
        while(!out.isEmpty()) in.push(out.pop());
        return top;
    }

    public int peek() {
        while(in.size()>1) out.push(in.pop());
        int top = in.peek();
        while(!out.isEmpty()) in.push(out.pop());
        return top;
    }

    public boolean empty() {
        return in.isEmpty();
    }
}
public class _3ImplementQueueUsingStack {
}
