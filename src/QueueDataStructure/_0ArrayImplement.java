package QueueDataStructure;

class queue {
    private int[] arr = new int[10];
    int f, r = 0;
    int len = 0;
    void add(int x) {
        arr[r++] = x;
        len++;
    }
    int remove() {
        int top = arr[f];
        f++; len--;
        return top;
    }
    int peek() {
        return arr[f];
    }
    int size() {
        return len;
    }
    void print() {
        for(int i = f; i<r; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class _0ArrayImplement {
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        System.out.println(q.remove());
        q.print();
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
