package ObjectOrientedProgramming.RevisionSet2;

class Calculator {
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, int b) {
        return a+b;
    }
    double add(int a, double b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }
}
public class Method_Overloading {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(23, 69));
        System.out.println(calculator.add(34.9, 89));
        System.out.println(calculator.add(67, 98.5));
        System.out.println(calculator.add(45.9, 87.9));
    }
}
