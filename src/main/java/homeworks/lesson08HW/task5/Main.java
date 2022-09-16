package homeworks.lesson08HW.task5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static homeworks.lesson08HW.Util.FOLDER_PATH;
import static homeworks.lesson08HW.Util.NEWLINE;

public class Main {
    public static void main(String[] args) throws IOException {

        final Map<String, Float> mapResults = new HashMap<>();
        final File[] arrFiles = new File(FOLDER_PATH).listFiles();

        for (File item : Objects.requireNonNull(arrFiles)) {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(item));
            int count = 0;
            while (bufferedReader.ready()) {
                if (count == 0) {
                    count++;
                    bufferedReader.readLine();
                    continue;
                }
                String[] lineResult = bufferedReader.readLine().split(";");
                if (mapResults.computeIfPresent(lineResult[0], (key, value) -> value + Float.parseFloat(lineResult[2])) == null) {
                    mapResults.putIfAbsent(lineResult[0], Float.parseFloat(lineResult[2]));
                }
                count++;
            }
            bufferedReader.close();
        }
        System.out.println(formattingResult(mapResults));
    }

    public static String formattingResult(final Map<String, Float> map) {
        //Расходы pyterochka за весь период: 20032220.00
        StringBuilder resultText = new StringBuilder();
        map.keySet().forEach(key -> {
                    float value = map.get(key);
                    resultText.append(String.format("Расходы %s за весь период: %.2f%s", key, value, NEWLINE));
                }
        );
        return String.valueOf(resultText);
    }
}
