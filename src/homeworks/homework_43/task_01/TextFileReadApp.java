package homeworks.homework_43.task_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Task 1. Reading data from a text file and displaying it on the screen
Description: Write a Java programme that will read data from a text file,
using FileReader and BufferedReader classes, and output it to the screen.*/

public class TextFileReadApp {
    public static void main(String[] args) throws IOException {

        String path = "src/homeworks/homework_43/task_01/fileToRead.txt";
        readTextFileWithFileReader(path);
        System.out.println();
        System.out.println("===============================================================================================");
        readTextFileWithBufferedReader(path);
    }

// 1. Method using Java-class FileReader:
    public static void readTextFileWithFileReader(String path) throws IOException {

        FileReader reader = new FileReader(path);

        int character;

        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }

// 2. Method using Java-class BufferedReader:
    public static void readTextFileWithBufferedReader(String path) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
