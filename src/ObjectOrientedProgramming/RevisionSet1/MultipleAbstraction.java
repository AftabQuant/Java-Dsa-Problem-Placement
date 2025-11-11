package ObjectOrientedProgramming.RevisionSet1;

abstract class Bird {
    abstract void fly();
}

class Falcon extends Bird {
    void fly() {
        System.out.println("Falcon is flying...");
    }
}

abstract class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle is flying...");
    }
    abstract void name();
}

class GoldenEagle extends Eagle {
    void fly() {
        System.out.println("Golden-Eagle is flying...");
    }

    void name() {
        System.out.println("Golden-Eagle");
    }
}

public class MultipleAbstraction {
    static void main(String[] args) {
        Falcon f1 = new Falcon();
        f1.fly();

        Eagle e1 = new GoldenEagle();
        e1.fly();
        e1.name();
    }
}
