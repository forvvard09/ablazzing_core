package homeworks.lesson08HW.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

import static homeworks.lesson08HW.Util.FOLDER_PATH;
import static homeworks.lesson08HW.Util.NEWLINE;

public class WayTwo {

    public static void main(String[] args) throws IOException {
        final File[] arrFiles = new File(FOLDER_PATH).listFiles();
        final StringBuilder resultText = new StringBuilder("Прибыль по магазину pyterochka по месяцам:" + NEWLINE);

        for (File item : Objects.requireNonNull(arrFiles)) {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(item));
            float result = 0;
            while (bufferedReader.ready()) {
                String[] lineResult = bufferedReader.readLine().split(";");
                if (lineResult[0].equals("pyterochka")) {
                    result += Float.parseFloat(lineResult[1]);
                }
            }
            bufferedReader.close();
            resultText.append(formattingDate(item.getName(), result));
        }
        System.out.println(resultText);
    }

    public static String formattingDate(String str, final float inputResult) {
        String result = str.replace(".", "_");
        String[] resultArr = result.split("_");
        return String.format("%s.%s: %.2f%n", resultArr[1], resultArr[2], inputResult);
    }
}
