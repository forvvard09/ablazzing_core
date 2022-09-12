package homeworks.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework1Tests {

    private final Homework1 homework1;

    private final static String newLine = System.lineSeparator();

    private final static String expectedResultOne = "Kindergarten";
    private final static String expectedResultTwo = "Junior School";
    private final static String expectedResultThree = "Secondary school";
    private final static String expectedResultFour = "University";

    private final static int[] expectedResultModernArray = {1, 2, 5, 7, 10, 2, 3, 2, 17, 15, 2, 6, 10, 119, 150};

    public Homework1Tests(final Homework1 homework1) {
        this.homework1 = homework1;
    }

    private void printStr(final String taskNumber, final String inputStr) {
        System.out.println("Task number: " + taskNumber);
        System.out.print(inputStr);
        System.out.println();
        System.out.println("====================");
    }


    //task 1
    //Задача №1
    //Дано (их менять нельзя)

    //Создать из трех переменных единую строку,
    //Привести к правильному виду (Ниже), убрать лишние слова,
    //затроить (Можно вызвать тольку одну команду System.out.print())
    //
    //Результат вывода на экран:
    //Hello world!
    //Hello world!
    //Hello world!
    public boolean getFormattingStrTest() {
        final String hi = "                Hello ";
        final String world = " WoRld!";
        final char newLine = '\n';
        final String result = homework1.getFormattingStr(hi, world, newLine, 3);
        final String expectedStr = "Hello world!\n" +
                "Hello world!\n" +
                "Hello world!\n";
        printStr("1-1", result);
        return expectedStr.equals(result);
    }

    //Задача №2
    //Создать переменные с ростом (!в метрах), весом.
    //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
    //Пример результата вывода на экран:
    //21.0

    public boolean getBodyMassIndexTest() {
        final double weight = 82.7;
        final double height = 1.85;
        final double expectedResult = 24.163623082542;
        final double result = homework1.getBodyMassIndex(weight, height);
        printStr("1-2", String.format("%.1f", result));
        return result == expectedResult;
    }

    //Задача №3
    //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
    //и снова создать строку, вывести на экран
    public boolean converterArrayToStringTest() {
        final String[] resultArr = homework1.converterArrayToString(new char[]{'a', 'b', 'c', 'd', 'e'}, 4, 'h');
        final String[] expectedResult = {"abcde", "abche"};
        printStr("1-3", resultArr[0] + "\n" + resultArr[1]);
        return resultArr[0].equals(expectedResult[0]) & resultArr[1].equals(expectedResult[1]);
    }

    // Задание №4 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
    // Ожидаемый результат: 1а 2а 3а .. 100а
    public boolean geSymbolLoopTest() {
        final String result = homework1.geSymbolLoop('a', 1, 100);
        final String expectedResult = "1a 2a 3a 4a 5a 6a 7a 8a 9a 10a 11a 12a 13a 14a 15a 16a 17a 18a 19a 20a 21a 22a 23a 24a 25a 26a 27a 28a 29a 30a 31a 32a 33a 34a 35a 36a 37a 38a 39a 40a 41a 42a 43a 44a 45a 46a 47a 48a 49a 50a 51a 52a 53a 54a 55a 56a 57a 58a 59a 60a 61a 62a 63a 64a 65a 66a 67a 68a 69a 70a 71a 72a 73a 74a 75a 76a 77a 78a 79a 80a 81a 82a 83a 84a 85a 86a 87a 88a 89a 90a 91a 92a 93a 94a 95a 96a 97a 98a 99a 100a";
        printStr("1-4", result);
        return result.equals(expectedResult);
    }

    //Задание №5
    // Дано:
    //int ageChildren = 10;
    // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
    // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
    // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
    // Проверьте работоспособность условий, через изменение значения переменной.

    public boolean chooseEducationalInstitutionTest() {

        final String resultOne = homework1.chooseEducationalInstitution(5);
        final String resultTwo = homework1.chooseEducationalInstitution(10);
        final String resultThree = homework1.chooseEducationalInstitution(16);
        final String resultFour = homework1.chooseEducationalInstitution(17);
        final String result = String.format("%s%s%s%s%s%s", resultOne, newLine, resultTwo, newLine, resultThree, newLine, resultFour);
        printStr("1-5a", result);
        return resultOne.equals(expectedResultOne) & resultTwo.equals(expectedResultTwo)
                & resultThree.equals(expectedResultThree) & resultFour.equals(expectedResultFour);
    }

    public boolean chooseEducationalInstitutionCaseTest() {
        final String resultOne = homework1.chooseEducationalInstitutionCase(5);
        final String resultTwo = homework1.chooseEducationalInstitutionCase(10);
        final String resultThree = homework1.chooseEducationalInstitutionCase(16);
        final String resultFour = homework1.chooseEducationalInstitutionCase(17);
        final String result = String.format("%s%s%s%s%s%s", resultOne, newLine, resultTwo, newLine, resultThree, newLine, resultFour);
        printStr("1-5b", result);
        return resultOne.equals(expectedResultOne) & resultTwo.equals(expectedResultTwo)
                & resultThree.equals(expectedResultThree) & resultFour.equals(expectedResultFour);
    }

    //Продвинутый уровень (Для тех, кто имеет опыт или базовая очень простая)
    //Задача №1
    //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

    public boolean parsingToNumberAddLengthStringTest() {
        final int expectedResult = 243;
        final int result = homework1.parsingToNumberAddLengthString("234", "some_text");
        printStr("2-1", String.valueOf(result));
        return expectedResult == result;
    }

    //Задача №2
    //Посчитать (a+b)^2 = ?, при a=3, b=5
    public boolean exponentiationTest() {
        final int expectedResult = 64;
        final int result = homework1.exponentiation(3, 5, 2);
        printStr("2-2", String.valueOf(result));
        return expectedResult == result;
    }

    //Задача №3
    //Создать два массив чисел:
    // 1,2,5,7,10
    // 2,3,2,17,15
    // Создать массив чисел, в котором будут: все числа из этих двух массивов,
    // и результат умножения чисел с одинаковым порядковым номером
    //
    //Ожидаемый результат:
    //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
    public boolean getModernArrayTest() {
        final int[] resultArr = homework1.getModernArray(new int[]{1, 2, 5, 7, 10}, new int[]{2, 3, 2, 17, 15});
        printStr("2-3a", Arrays.toString(resultArr));
        return Arrays.equals(expectedResultModernArray, resultArr);
    }

    public boolean getModernArrayOptTest() {
        final int[] resultArr = homework1.getModernArrayOpt(new int[]{1, 2, 5, 7, 10}, new int[]{2, 3, 2, 17, 15});
        printStr("2-3b", Arrays.toString(resultArr));
        return Arrays.equals(expectedResultModernArray, resultArr);
    }

    //Задача №4
    //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
    public boolean getModificationStringTest() {
        final String expectedResult = "HERRO WO";
        final String result = homework1.getModificationString("Hello world!", 'l', 'r', 8);
        printStr("2-4", result);
        return expectedResult.equals(result);
    }

    // Задание №5: Написать цикл, который будет прибавлять число к result до тех пор,
    // пока не получиться больше 1_000_000.
    // Дано:
    //double increment = 0.01123;
    //double result = 0;
    // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
    // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
    // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
    public boolean getCountStepCycleTest() {
        final int expectedResult = 89047196;
        final int result = homework1.getCountStepCycle(0.01123, 1_000_000);
        printStr("2-5", result == -1 ? "" : String.valueOf(result));
        return result == -1 || expectedResult == result;
    }

    //Задание №6
    // Дано:
    //boolean chicken = true;
    //boolean vegetables = false;
    //boolean sour = true;
    //boolean toast = true;
    //boolean sausage = true;
    //boolean eggs = true;
    // Задача: Повара попросили сделать салат.
    // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
    // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
    // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
    public boolean getSaladTest() {
        final String expectedResultCesar = "Салат Цезарь";
        final String expectedResultOlivie = "Салат Оливье";
        final String expectedResultVegan = "Салат Овощной";
        final String expectedResultEmpty = "У меня ничего нет!";

        final String resultCesar = homework1.getSalad(true, true, true, true, true, true);
        final String resultOlivie = homework1.getSalad(false, true, true, true, true, true);
        final String resultVegan = homework1.getSalad(false, true, false, false, false, false);
        final String resultEmpty = homework1.getSalad(true, false, true, true, true, true);

        final String finalResult = String.format("%s%s%s%s%s%s%s", resultCesar, newLine, resultOlivie, newLine, resultVegan, newLine, resultEmpty);
        printStr("2-6", finalResult);

        return expectedResultCesar.equals(resultCesar) & expectedResultEmpty.equals(resultEmpty)
                & expectedResultOlivie.equals(resultOlivie) & expectedResultVegan.equals(resultVegan);
    }

    //Задача №1
    //Создать метод маскирования персональных данных, который:
    //Телефон (до/после маскирования): 79991113344 / 7999***3344
    //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
    //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
    //
    //Входящие параметры: String text
    //Возвращаемый результат: String
    //
    //Примеры возможного текста:
    //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
    //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
    //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

    private Boolean getMasksTextTest() {
        String expectedResultOne = "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>";
        String expectedResultTwo = "<client>(Какие то данные)<data></data></client>";
        String expectedResultThree = "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>";


        String resultOne = homework1.getMasksText("<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>");
        String resultTwo = homework1.getMasksText("<client>(Какие то данные)<data></data></client>");
        String resultThree = homework1.getMasksText("<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>");

        printStr("3-1", String.format("%s%s%s%s%s", resultOne, newLine, resultTwo, newLine, resultThree));

        return expectedResultOne.equals(resultOne) & expectedResultTwo.equals(resultTwo) & expectedResultThree.equals(resultThree);
    }

    public static class ResultTest {
        String nameTask;
        String result;

        public ResultTest(String nameTask, boolean inputResult) {
            this.nameTask = nameTask;
            this.result = inputResult ? "Done!" : "Fail!";
        }

        @Override
        public String toString() {
            return "Task: " + this.nameTask + "-" + this.result;
        }
    }

    public static void main(String[] args) {

        Homework1Tests tests = new Homework1Tests(new Homework1());

        List<ResultTest> listResult = new ArrayList<>();

        //task 1-1
        listResult.add(new ResultTest("1-1", tests.getFormattingStrTest()));

        //task 1-2
        listResult.add(new ResultTest("1-2", tests.getBodyMassIndexTest()));

        //task 1-3
        listResult.add(new ResultTest("1-3", tests.converterArrayToStringTest()));

        //task 1-4
        listResult.add(new ResultTest("1-4", tests.geSymbolLoopTest()));

        //task 1-5a
        listResult.add(new ResultTest("1-5a", tests.chooseEducationalInstitutionTest()));

        //task 1-5b
        listResult.add(new ResultTest("1-5b", tests.chooseEducationalInstitutionCaseTest()));

        //task 2-1
        listResult.add(new ResultTest("2-1", tests.parsingToNumberAddLengthStringTest()));

        //task 2-2
        listResult.add(new ResultTest("2-2", tests.exponentiationTest()));

        //task 2-3a
        listResult.add(new ResultTest("2-3a", tests.getModernArrayTest()));

        //task 2-3b
        listResult.add(new ResultTest("2-3b", tests.getModernArrayOptTest()));

        //task 2-4
        listResult.add(new ResultTest("2-4", tests.getModificationStringTest()));

        //task 2-5
        listResult.add(new ResultTest("2-5", tests.getCountStepCycleTest()));

        //task 2-6
        listResult.add(new ResultTest("2-6", tests.getSaladTest()));

        //task 3-1
        listResult.add(new ResultTest("3-1", tests.getMasksTextTest()));

        listResult.forEach(System.out::println);
    }
}
