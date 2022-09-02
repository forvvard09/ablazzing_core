package homeworks.lesson04HW.task6;

public class Human {

    private int age;
    private String name;
    private int weight;

    private Human() {
    }

    public static HumanBuilder builder() {
        return new HumanBuilder(new Human());
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void getInfoHuman() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s - возраст %s, вес %s", this.name, this.age, this.weight);
    }

    public static class HumanBuilder {
        private final Human newHuman;

        private HumanBuilder(Human human) {
            newHuman = human;
        }

        public HumanBuilder age(int age) {
            newHuman.age = age;
            return this;
        }

        public HumanBuilder name(String name) {
            newHuman.name = name;
            return this;
        }

        public HumanBuilder weight(int weight) {
            newHuman.weight = weight;
            return this;
        }

        public Human build() {
            return newHuman;
        }
    }
}
