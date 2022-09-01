package homeworks.lesson04HW.task1;

public class Main {

    public static void main(String[] args) {
        Zebra zebra1 = new Zebra(2, true);
        Zebra zebra2 = new Zebra(5, false, "Kashtan");
        Kangaroo kangaroo = new Kangaroo();
        Kangaroo kangaroo2 = new Kangaroo(33, 17, 21);
        Kangaroo kangaroo3 = new Kangaroo(11, 1, 27, "Blue");

        System.out.println(zebra1);
        System.out.println(zebra2);
        System.out.println(kangaroo);
        System.out.println(kangaroo2);
        System.out.println(kangaroo3);

    }
}
