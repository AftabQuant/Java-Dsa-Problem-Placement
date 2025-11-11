package ObjectOrientedProgramming.RevisionSet1;

class Book {
    void type() {
        System.out.println("Parent Type");
        System.out.println();
    }
}

class Book1 extends Book {
    void type() {
        System.out.println("Child Type");
        System.out.println();
    }
}
public class Inheritance {
    static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.type(); // Child Type

        Book b2 = new Book();
        b2.type(); // Parent Type

        Book b3 = new Book1();
        b3.type(); // Child Type

    }
}
