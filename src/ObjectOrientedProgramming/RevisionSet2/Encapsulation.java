package ObjectOrientedProgramming.RevisionSet2;

class Bank {
    String name;
    private double balance;

    Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance += balance;
    }
    void display() {
        System.out.println("Name :: " + name);
        System.out.println("Bal  :: " + balance);
    }
}
public class Encapsulation {
    static void main(String[] args) {
        Bank bank = new Bank("Abc", 75000);
        bank.display();
        bank.setBalance(23000);
        System.out.println(bank.getBalance());
    }
}
