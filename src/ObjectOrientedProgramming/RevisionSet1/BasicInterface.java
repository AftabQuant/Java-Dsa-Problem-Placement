package ObjectOrientedProgramming.RevisionSet1;

interface Icalculator {
    void add1(int a, int b);
    void sub(int a, int b);
}

interface Icalculator2 {
    void mul(int a, int b);
    void div(int a, int b);
}
class Calculator1 implements Icalculator, Icalculator2 {
    public void add1(int a, int b) {
        System.out.println(a + b);
    }
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
    public void mul(int a, int b){
        System.out.println(a * b);
    }
    public void div(int a, int b){
        System.out.println(a / b);
    }
}
public class BasicInterface {
    static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        cal.add1(2,3);
        cal.sub(10,4);
        cal.mul(2, 3);
        cal.div(10, 2);
    }
}
