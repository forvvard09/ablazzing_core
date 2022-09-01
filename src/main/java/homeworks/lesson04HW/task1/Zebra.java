package homeworks.lesson04HW.task1;

public class Zebra {
    private int age;
    private boolean isMale;
    private String name;

    public Zebra(int age, boolean isMale) {
        this.age = age;
        this.isMale = isMale;
        this.name = "No name";
    }

    public Zebra(int age, boolean isMale, String name) {
        this(age, isMale);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "age=" + age +
                ", isMale=" + isMale +
                ", name='" + name + '\'' +
                '}';
    }
}
