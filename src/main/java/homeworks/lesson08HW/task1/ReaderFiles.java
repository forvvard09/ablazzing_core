package homeworks.lesson08HW.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static homeworks.lesson08HW.Util.PATH;

public class ReaderFiles {

    private final static String FILE_NAME = "my_first_file.txt";

    public static void main(String[] args) throws IOException {
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));

        FileReader fileReader = new FileReader(PATH + FILE_NAME);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder sb = new StringBuilder();

        while (bufferedReader.ready()) {
            sb.append(bufferedReader.readLine());
            sb.append(" ");
        }
        bufferedReader.close();

        String result = sb.toString().trim().replaceAll("\"", "");
        System.out.println(String.format("\"%s\"", result));
    }
}
