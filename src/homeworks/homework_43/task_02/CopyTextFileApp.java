package homeworks.homework_43.task_02;

import java.io.*;

/*
Task 2. Copying the contents of one file to another
        Description: Write a Java programme that will copy the contents of one text file to
        another using the FileReader, FileWriter, and BufferedReader classes.
        The user should be able to specify the source and target files as arguments.
 */
public class CopyTextFileApp {
    public static void main(String[] args) throws IOException {

        String path1 = "src/homeworks/homework_43/task_01/fileToRead.txt";
        String path2 = "src/homeworks/homework_43/task_02/fileToRead_Copy.txt";
        String path3 = "src/homeworks/homework_43/task_02/fileToRead_CopyBuffered.txt";
        copyContentsFromOneFileToAnother(path1,path2); // using FileReader & FileWriter
        System.out.println();
        copyContentsFromOneFileToAnotherBuffered(path2,path3); // using BufferedReader & BufferedWriter

    }
    public static void copyContentsFromOneFileToAnother(String inputPath, String outputPath) throws IOException {
        FileReader fileReader = new FileReader(inputPath);
        FileWriter fileWriter = new FileWriter(outputPath);

        int character;

        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);
            fileWriter.write(character);

        }
        fileReader.close();
        fileWriter.close();
    }
    public static void copyContentsFromOneFileToAnotherBuffered(String inputPath, String outputPath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
