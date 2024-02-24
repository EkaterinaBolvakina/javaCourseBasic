package homeworks.homework_29.task_04_HashMap;

import java.util.Map;

public class StudentService {
    public void findStudentWithBestGrade(Map<String,Double> studentGradeCollection){
        String bestStudent = null;
        double maxGrade = Double.MAX_VALUE;

        for (Map.Entry<String,Double> entry : studentGradeCollection.entrySet() ){
            String student = entry.getKey();
            Double grade = entry.getValue();

            if (grade < maxGrade) {
                maxGrade = grade;
                bestStudent= student;
            }
        }
        System.out.println("Student with best grade: "+bestStudent+" (Grade: "+maxGrade+")");
    }

    public void changeGrade(Map<String,Double> studentGradeCollection, String studentName,double newGrade){
        if (studentGradeCollection.containsKey(studentName)){
            studentGradeCollection.put(studentName,newGrade);
            System.out.println("Grade for student "+studentName+" updated to: "+newGrade);
        } else {
            System.out.println("Student is not found in collection");
        }
    }
    public void printStudentGrades(Map<String,Double> studentGradeCollection){
        System.out.println("------------- STUDENT GRADE LIST ----------------");
        for (Map.Entry<String,Double> entry : studentGradeCollection.entrySet()){
            System.out.println("Student: "+entry.getKey() +" (Grade: "+entry.getValue()+")");
        }
        System.out.println("------------- END LIST ----------------");
    }
}
