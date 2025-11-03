package ObjectOrientedProgramming;

class Calculator {
    public void add(float a, float b) {
        System.out.println("Float-Float Type casting");
    }
}
public class ImplicitTypeCasting {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
    }
}
