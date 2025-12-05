package ObjectOrientedProgramming.RevisionSet2;

class Parent {
    String name;
    int age;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void details() {
        System.out.println("name :: " + name);
        System.out.println("Age  :: " + age);
    }
}

class Child extends Parent {

    String add;

    Child(String name, int age, String add) {
        super(name, age);
        this.add = add;
    }

    void details() {
        System.out.println("name :: " + name);
        System.out.println("Age  :: " + age);
        System.out.println("Add  :: " + add);
    }
}
public class Inheritance {
    static void main(String[] args) {
        Parent parent = new Child("Abc", 21, "Kolkata");
        parent.details();

    }
}
