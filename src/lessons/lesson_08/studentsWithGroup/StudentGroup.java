package lessons.lesson_08.studentsWithGroup;

public class StudentGroup {
    private String groupName;
    private String startDate;
    private int studentCount;

    public StudentGroup(String groupName, String startDate, int studentCount) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Group: " + groupName + '\'' +
                ", Start date: " + startDate + '\'' +
                ", Count of students in the group: " + studentCount;
    }
}
