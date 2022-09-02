package homeworks.lesson04HW.task5;

public abstract class Car {

    public void start() {
        System.out.println("Начать движение.");
    }

    public void stop() {
        System.out.println("Остановиться.");
    }

    public void useHeadlights() {
        System.out.println("Включить фары.");
    }

    abstract void feature();

    abstract void actions();
}
