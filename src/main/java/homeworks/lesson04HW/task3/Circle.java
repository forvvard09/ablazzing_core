package homeworks.lesson04HW.task3;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void drawCircle() {
        System.out.println("Рисуем круг с радиусом: " + this.radius);
    }
}
