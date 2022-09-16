package homeworks.lesson08HW.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static homeworks.lesson08HW.Util.NEWLINE;
import static homeworks.lesson08HW.Util.PATH;

public class Main {

    public static final int COUNT_REPORTS = 10;
    private final static String FILE_NAME = "report2.txt";

    public static void main(String[] args) throws IOException {

        final FinancialRecord[] financialRecordsArray = new FinancialRecord[COUNT_REPORTS];
        //System.out.println(Arrays.toString(fillRecordsArray(financialRecordsArray)));
        recordToFile(PATH + FILE_NAME, fillRecordsArray(financialRecordsArray));
        printResult(PATH + FILE_NAME);

    }

    public static int generatorNumber() {
        Random r = new Random();
        return r.nextInt(10000);
    }

    public static FinancialRecord[] fillRecordsArray(final FinancialRecord[] inputArray) {
        /*for (FinancialRecord item: financialRecordCopy) {
            item = new FinancialRecord(generatorNumber(), generatorNumber());
        }*/
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = new FinancialRecord(generatorNumber(), generatorNumber());
        }

        return inputArray;
    }

    public static void recordToFile(final String path, final FinancialRecord[] inputArray) throws IOException {
        homeworks.lesson08HW.task2.FinancialRecord financialRecord = new homeworks.lesson08HW.task2.FinancialRecord(500, 300);
        FileWriter fileWriter = new FileWriter(PATH + FILE_NAME);

        for (FinancialRecord item : inputArray) {
            fileWriter.write(String.format("%s;%s%s", item.getIncomes(), item.getOutcomes(), NEWLINE));
        }
        fileWriter.close();
    }

    public static void printResult(final String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        //доход
        int incomesResult = 0;

        //расход
        int outcomesResult = 0;

        while (bufferedReader.ready()) {
            String[] lineResult = bufferedReader.readLine().split(";");
            incomesResult += Integer.parseInt(lineResult[0]);
            outcomesResult += Integer.parseInt(lineResult[1]);
        }
        bufferedReader.close();
        System.out.printf("Общие доходы - %s, общие расходы - %s%n", incomesResult, outcomesResult);
    }
}
