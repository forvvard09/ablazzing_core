package homeworks.lesson04HW.task5;

public class CarFactory {

    public static Car createToyota() {
        return new Toyota();
    }

    public static Car createZhiguli() {
        return new Zhiguli();
    }
}
