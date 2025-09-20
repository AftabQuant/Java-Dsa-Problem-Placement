package ObjectOrientedProgramming;

class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getAge());
        student.setAge(21);
        System.out.println(student.getAge());
    }
}
