package ObjectOrientedProgramming;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dis() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student1 extends Person {
    String grade;
    double marks;

    public Student1(String grade, double marks, String name, int age) {
        super(name, age);
        this.grade = grade;
        this.marks = marks;
    }

    public void dis() {
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

class Student2 extends Student1 {
    int rank;

    public Student2(String grade, double marks, String name, int age, int rank) {
        super(grade, marks, name, age);
        this.rank = rank;
    }

    public void dis() {
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Student1 st = new Student1("A", 87.7, "Aftab", 21);

        st.dis();
    }
}
