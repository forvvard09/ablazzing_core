package homeworks.lesson08HW.task2;

import java.io.FileWriter;
import java.io.IOException;

import static homeworks.lesson08HW.Util.PATH;

public class Main {

    private final static String FILE_NAME = "report.txt";

    public static void main(String[] args) throws IOException {

        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        FileWriter fileWriter = new FileWriter(PATH + FILE_NAME);

        //fileWriter.write(String.format("доходы = %s, расходы %s", financialRecord.getIncomes(), financialRecord.getOutcomes()));
        fileWriter.write(String.format("%s, %s", financialRecord.getFormattingIncomes(), financialRecord.getFormattingOutcomes()));
        fileWriter.close();
    }
}
