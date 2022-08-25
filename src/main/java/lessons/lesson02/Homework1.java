package lessons.lesson02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {

    //Базовый уровень

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
    //Hello world!
    public String getFormattingStr(final String inputStrOne, final String inputStrTwo, final char newLine, final int countRepeat) {
        return String.format("%s %s%s", inputStrOne.trim(), inputStrTwo.trim().toLowerCase(), newLine).repeat(countRepeat);
    }

    //Задача №2
    //Создать переменные с ростом (!в метрах), весом.
    //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
    //Пример результата вывода на экран:
    //21.0
    public final double getBodyMassIndex(double weight, double height) {
        if (weight == 0) {
            weight = 1;
        } else if (height == 0) {
            height = 1;
        }
        return weight / (height * height);
    }

    //Задача №3
    //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
    //и снова создать строку, вывести на экран
    public String[] converterArrayToString(final char[] inputArray, final int changeIndex, final char changeSymbol) {
        String resultOne = new String(inputArray);
        inputArray[changeIndex - 1] = changeSymbol;
        String changeResult = String.valueOf(inputArray);
        return new String[]{resultOne, changeResult};
    }

    // Домашка
    // Задание №4 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
    // Ожидаемый результат: 1а 2а 3а .. 100а
    public String geSymbolLoop(final char symbol, final int startIndex, final int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i <= count; i++) {
            sb.append(String.format("%s%s", i, symbol));
            if (i != count) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Задание №5
    // Дано:
    //int ageChildren = 10;
    // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
    // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
    // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
    // Проверьте работоспособность условий, через изменение значения переменной.

    public String chooseEducationalInstitution(int ageChildren) {
        String result;
        ageChildren = ageChildren <= 0 ? 1 : ageChildren;
        if (ageChildren < 6) {
            result = "Kindergarten";
        } else if (ageChildren < 11) {
            result = "Junior School";
        } else if (ageChildren < 17) {
            result = "Secondary school";
        } else {
            result = "University";
        }
        return result;
    }

    public String chooseEducationalInstitutionCase(int ageChildren) {
        String result;

        switch (ageChildren = ageChildren <= 0 ? 1 : ageChildren) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Kindergarten";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                result = "Junior School";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                result = "Secondary school";
                break;
            default:
                result = "University";
                break;
        }
        return result;
    }

    //Продвинутый уровень (Для тех, кто имеет опыт или базовая очень простая)
    //Задача №1
    //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
    public final int parsingToNumberAddLengthString(final String parsingStr, final String str) {
        return Integer.parseInt(parsingStr) + str.length();
    }

    //Задача №2
    //Посчитать (a+b)^2 = ?, при a=3, b=5

    public int exponentiation(final int a, final int b, final int degree) {
        return (int) Math.pow((a + b), degree);
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
    //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
    //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

    public final int[] getModernArray(final int[] inputArrOne, final int[] inputArrTwo) {
        final int[] resultArr = new int[inputArrOne.length * 3];
        for (int i = 0; i < inputArrOne.length; i++) {
            resultArr[i] = inputArrOne[i];
            resultArr[inputArrOne.length + i] = inputArrTwo[i];
            resultArr[inputArrOne.length * 2 + i] = inputArrOne[i] * inputArrTwo[i];
        }
        return resultArr;
    }

    public final int[] getModernArrayOpt(final int[] inputArrOne, final int[] inputArrTwo) {
        final int[] resultArr = new int[inputArrOne.length * 3];
        int globalIndex = 0;
        for (int one : inputArrOne) {
            resultArr[globalIndex++] = one;
        }
        globalIndex = 0;
        for (int two : inputArrTwo) {
            resultArr[inputArrOne.length + globalIndex] = two;
            resultArr[inputArrOne.length + inputArrTwo.length + globalIndex] = inputArrOne[globalIndex] * two;
            globalIndex++;
        }
        return resultArr;
    }

    //Задача №4
    //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
    public final String getModificationString(final String phrase, final char symbolForChange, final char newSymbol, int countSymbols) {
        return phrase.replace(symbolForChange, newSymbol).toUpperCase().substring(0, countSymbols);
    }

    // Задание №5: Написать цикл, который будет прибавлять число к result до тех пор,
    // пока не получиться больше 1_000_000.
    // Дано:
    //double increment = 0.01123;
    //double result = 0;
    // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
    // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
    // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
    public final int getCountStepCycle(final double increment, final double max) {
        double result = 0;
        int count = 0;
        while (result >= 0 & result < max) {
            result += increment;
            count++;
        }
        return result >= 0 ? count : -1;
    }

    // Задание №6
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
    // Если ингредиентов нет, то повар объявляет: У меня ничего нет
    // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
    // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
    // Проверьте работоспособность условий, через изменение значения переменных.
    public final String getSalad(final boolean chicken, final boolean vegetables, final boolean sour, final boolean toast, final boolean sausage, boolean eggs) {
        String result = "У меня ничего нет!";
        if (chicken & vegetables & sour & toast) {
            result = "Салат Цезарь";
        } else if (vegetables & (sausage | chicken) & eggs) {
            result = "Салат Оливье";
        } else if (vegetables) {
            result = "Салат Овощной";
        }
        return result;
    }

    //Экспертный уровень
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

    //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
    //Регулярные выражения, класс StringBuilder

    public String getMasksText(String text) {
        //получить строку между <data></data>

        String findStr = "Empty value";
        String result = "";

        Pattern pattern = Pattern.compile("<data>(.*?)</data>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            findStr = matcher.group(1);
        }

        // return должен быть один - закомментим - но так было бы красивее
        /*
        if (findStr.length() == 0) {
            return text;
        }
         */

        if (findStr.length() > 0) {
            String[] arrStrForChange = findStr.split(";");
            String[] arrMaskedValue = maskedArrayStr(arrStrForChange);

            result = changeValueInTextOnMaskedValue(text, arrStrForChange, arrMaskedValue);
        }

        return findStr.length() == 0 ? text : result;
    }

    private String[] maskedArrayStr(String[] inputArr) {
        String[] arrStrMasks = new String[inputArr.length];
        String regexNumbers = "\\d+";

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].matches(regexNumbers)) {
                //method for change number phone
                arrStrMasks[i] = maskedPhoneNumber(inputArr[i]);
            } else if (inputArr[i].contains("@")) {
                //method for change mail
                arrStrMasks[i] = maskedMail(inputArr[i]);
            } else {
                //method for change name
                arrStrMasks[i] = maskedName(inputArr[i]);
            }
        }
        return arrStrMasks;
    }

    private String maskedPhoneNumber(String phoneNumber) {
        StringBuilder strBuilder = new StringBuilder(phoneNumber);
        return strBuilder.replace(4, 7, "***").toString();
    }

    private String maskedMail(String mail) {
        //index for '@'
        int indexOne = mail.indexOf('@');
        //index for last '.'
        int indexTwo = mail.lastIndexOf('.');

        StringBuilder strBuilder = new StringBuilder(mail);
        strBuilder.replace(indexOne - 1, indexOne, "*").replace(indexOne + 1, indexTwo, countSymbolsForMasked(indexOne, indexTwo));
        return strBuilder.toString();
    }

    private String maskedName(String name) {
        String[] arrFIO = name.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        int index = 1;
        for (String str : arrFIO) {
            switch (index) {
                case 1:
                    StringBuilder tempStrBuilder = new StringBuilder(str);
                    strBuilder.append(tempStrBuilder.replace(1, str.length() - 1, countSymbolsForMasked(1, str.length()))).append(" ");
                    break;
                case 2:
                    strBuilder.append(str).append(" ");
                    break;
                default:
                    tempStrBuilder = new StringBuilder(str);
                    strBuilder.append(tempStrBuilder.replace(1, str.length(), "."));
                    break;
            }
            index++;
        }
        return strBuilder.toString();
    }

    private String countSymbolsForMasked(final int start, final int finish) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < finish - 1; i++) {
            str.append("*");
        }
        return str.toString();
    }

    private String changeValueInTextOnMaskedValue(String text, String[] arrValue, String[] arrNewValue) {
        String result = text;

        for (int i = 0; i < arrValue.length; i++) {
            result = result.replaceAll(arrValue[i], arrNewValue[i]);
        }
        return result;
    }
}

