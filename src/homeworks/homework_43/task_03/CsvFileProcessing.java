package homeworks.homework_43.task_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Task 3. reading data from a CSV file and processing it
        Description: Write a Java program that will read data from a CSV (Comma-Separated Values)
        file using the FileReader and BufferedReader classes and process it.
        The program must be able to parse strings from the file into comma-separated fields,
        and perform certain operations on the data, such as summarising, searching for specific values, etc.
 */
public class CsvFileProcessing {
    public static void main(String[] args) {

        String filePath = "src/homeworks/homework_43/task_03/csv_file_input_data.csv"; //Name,Alter,Geschlecht,Abteilung,Gehalt
        List<String[]> data = readCSVFile(filePath);
        //System.out.println(data);
        List<Person> personList = new ArrayList<>();

        if (data != null) {
            // Additional task: Parse each line of CSV data into Person objects and add them to personList
            for (String[] line : data) {
                String name = line[0];
                Integer age = Integer.parseInt(line[1]);
                String gender = line[2];
                String department = line[3];
                Integer salary = Integer.parseInt(line[4]);
                personList.add(new Person(name, age, gender, department, salary));
            }
            System.out.println(personList);

            Integer totalRecords = summarizeData(data);
            System.out.println("Total records/lines in CSV-file: "+totalRecords);

            searchForElement(data,"30");
        }else {
            System.out.println("Failed to read data from the CSV file.");
        }

    }
    public static List<String[]> readCSVFile(String path) {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: "+ e.getMessage());
            return null;
        }
        return data;
    }
    public static Integer summarizeData(List<String[]> data) {
        return  data.size();
    }
    public static void searchForElement(List<String[]> data, String searchElement) {
        System.out.println("Searching for: " + searchElement);
        boolean found = false;
        for (String[] line : data) {
            for (String element : line) {
                if (element.equalsIgnoreCase(searchElement)) {
                    System.out.println("Found in line: " + String.join(",", line));
                    found = true;
                    break; // Break out of inner loop after finding the element
                }
            }
        }
        if (!found) {
            System.out.println("Not found: " + searchElement);
        }
    }


}
