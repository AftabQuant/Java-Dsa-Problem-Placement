package ObjectOrientedProgramming.RevisionSet1;

// Method Overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
}

// Method OverRidding

class Parent {
    void type() {
        System.out.println("I am parent class...");
    }
}
class Child extends Parent {
    void type() {
        System.out.println("I am child class...");
    }
}
public class Polymorphism {
    static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(20, 30));
        System.out.println(cal.add(20, 24.5));
        System.out.println(cal.add(20.9, 45));
        System.out.println(cal.add(23.3, 78.2));

        Child ch1 = new Child();
        ch1.type();
        Parent ch2 = new Child();
        ch2.type();
    }
}
