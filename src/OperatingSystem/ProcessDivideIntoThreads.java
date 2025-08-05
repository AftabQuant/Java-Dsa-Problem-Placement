package OperatingSystem;
import java.util.concurrent.*;

public class ProcessDivideIntoThreads {
    public static void main(String[] args) {
        Thread taskA = new Thread(() -> {
            for(int i=1; i<=5; i++) {
                System.out.println("taskA: " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread taskB = new Thread(() -> {
            for(int i=1; i<=5; i++) {
                System.out.println("taskB: " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        taskA.start();
        taskB.start();
    }
}
