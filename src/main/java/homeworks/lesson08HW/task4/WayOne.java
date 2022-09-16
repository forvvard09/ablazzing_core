package homeworks.lesson08HW.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import static homeworks.lesson08HW.Util.FOLDER_PATH;
import static homeworks.lesson08HW.Util.NEWLINE;

public class WayOne {
    public static void main(String[] args) throws IOException {
        final Map<String, Float> mapResults = new LinkedHashMap<>();
        final File[] arrFiles = new File(FOLDER_PATH).listFiles();

        for (File item : Objects.requireNonNull(arrFiles)) {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(item));
            while (bufferedReader.ready()) {
                String[] lineResult = bufferedReader.readLine().split(";");
                if (lineResult[0].equals("pyterochka")) {
                    String[] dateLine = lineResult[3].split("/");
                    String formatDate = (String.format("%s.%s", dateLine[1], dateLine[2]));
                    if (mapResults.computeIfPresent(formatDate, (key, value) -> value + Float.parseFloat(lineResult[1])) == null) {
                        mapResults.putIfAbsent(formatDate, Float.parseFloat(lineResult[1]));
                    }
                }
            }
            bufferedReader.close();
        }
        //System.out.println(List.of(mapResults));
        //System.out.println(mapResults.size());
        System.out.println(formattingResult(mapResults));
    }

    public static String formattingResult(final Map<String, Float> map) {
        StringBuilder resultText = new StringBuilder("Прибыль по магазину pyterochka по месяцам:" + NEWLINE);
        map.keySet().forEach(key -> {
                    float value = map.get(key);
                    String formatKey = key.length() < 7 ? "0" + key : key;
                    resultText.append(String.format("%s: %s%s", formatKey, value, NEWLINE));
                }
        );
        return String.valueOf(resultText);
    }
}
