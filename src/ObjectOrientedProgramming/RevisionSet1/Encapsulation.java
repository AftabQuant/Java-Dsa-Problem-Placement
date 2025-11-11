package ObjectOrientedProgramming.RevisionSet1;


class Teacher {
    String name;
    int age;
    private double salary;

    Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    double getSalary() {
        return  salary;
    }

    void setSalary(double salary) {
        this.salary += salary;
    }

    void display() {
        System.out.println("Name: " + name +" \n" + "Age: " + age + " \n" + "Salary: " + salary);
    }
}
public class Encapsulation {
    static void main(String[] args) {
        Teacher t1 = new Teacher("Aftab", 21, 50000);
        t1.display();
        System.out.println("Salary: " + t1.getSalary());
        t1.setSalary(45000);
        System.out.println("Salary: " + t1.getSalary());
    }

}
