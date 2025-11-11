package ObjectOrientedProgramming.RevisionSet1;


abstract class Human {
    String name;
    int age;
    String sex;

    Human(String name, int age , String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    abstract void details();
}

class Male extends Human {
    double height;
    Male(String name, int age , String sex, double height) {
        super(name, age, sex);
        this.height = height;
    }

    void details() {
        System.out.println("Name is   :: " + name);
        System.out.println("Age is    :: " + age);
        System.out.println("Sex is    :: " + sex);
        System.out.println("Height is :: " + height);
    }
}
public class AbstractClassWithConstructor {
    static void main(String[] args) {
        Human male = new Male("Aftab", 21, "male", 160);
        male.details();
    }
}
