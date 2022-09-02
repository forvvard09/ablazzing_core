package homeworks.lesson04HW.task5;

public class Zhiguli extends Car {
    @Override
    void feature() {
        System.out.println("Ломается.");
    }

    @Override
    void actions() {
        start();
        feature();
        stop();
    }
}
