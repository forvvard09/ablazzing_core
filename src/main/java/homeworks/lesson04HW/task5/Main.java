package homeworks.lesson04HW.task5;

public class Main {

    public static final int COUNT_EVERY_CARS = 20;

    public static void main(String[] args) {

        Car[] cars = new Car[COUNT_EVERY_CARS * 2];

        for (int i = 0; i < COUNT_EVERY_CARS; i++) {
            cars[i] = CarFactory.createToyota();
        }

        for (int i = COUNT_EVERY_CARS; i < cars.length; i++) {
            cars[i] = CarFactory.createZhiguli();
        }

        for (Car car : cars) {
            if (car instanceof Toyota) {
                //car.actions();
                //car.feature();
                Toyota toyota = (Toyota) car;
                //toyota.actions();
                toyota.feature();
            } else if (car instanceof Zhiguli) {
                //car.actions();
                //car.feature();
                Zhiguli zhiguli = (Zhiguli) car;
                //zhiguli.actions();
                zhiguli.feature();
            } else {
                System.out.println("Что-то непонятное. Ошибка.");
            }
        }
    }
}
