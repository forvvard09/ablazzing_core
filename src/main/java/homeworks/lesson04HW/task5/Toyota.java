package homeworks.lesson04HW.task5;

public class Toyota extends Car {

    @Override
    void feature() {
        System.out.println("Включает музыку.");
    }

    @Override
    void actions() {
        start();
        feature();
        stop();
    }

}
