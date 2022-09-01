package homeworks.lesson04HW.task2;

public abstract class Computer extends Electronic {

    public void loadSystem() {
        System.out.println("загрузка компьютера");
    }

    public void work() {
        System.out.println("выполняет вычисления");
    }
}
