package homeworks.lesson04HW.task1;

public class Kangaroo {

    private int age;
    private int countBrother;
    private int countSisters;
    private String color;

    public Kangaroo() {
        this.color = "Red";
    }

    public Kangaroo(int age, int countBrother, int countSisters) {
        this();
        this.age = age;
        this.countBrother = countBrother;
        this.countSisters = countSisters;
    }

    public Kangaroo(int age, int countBrother, int countSisters, String color) {
        this.age = age;
        this.countBrother = countBrother;
        this.countSisters = countSisters;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountBrother() {
        return countBrother;
    }

    public void setCountBrother(int countBrother) {
        this.countBrother = countBrother;
    }

    public int getCountSisters() {
        return countSisters;
    }

    public void setCountSisters(int countSisters) {
        this.countSisters = countSisters;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "age=" + age +
                ", countBrother=" + countBrother +
                ", countSisters=" + countSisters +
                ", color='" + color + '\'' +
                '}';
    }
}
