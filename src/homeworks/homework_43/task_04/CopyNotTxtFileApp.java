package homeworks.homework_43.task_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
Task 4.* Copying the contents of one file to another (not text file!!!)
         Description: Write a program in Java that will copy the contents of one
         file (e.g. a picture) into another.
         The user should be able to specify the source and target files as arguments.
 */
public class CopyNotTxtFileApp {
    public static void main(String[] args) {
        String sourceFilePath = "src/homeworks/homework_43/task_04/collections1.jpeg";
        String destinationFilePath = "src/homeworks/homework_43/task_04/collections1_Copy.jpeg";

        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path destinationPath = Paths.get(destinationFilePath);

            Files.copy(sourcePath, destinationPath);

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
