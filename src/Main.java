import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int numOfStudent = 20;
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < numOfStudent; i++) {
            studentList.add(new Student("SID" + i, "Student#" + i, i));
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGPA() == o2.getGPA()) {
                    return 0;
                }
                if (o1.getGPA() > o2.getGPA()) {
                    return -1;
                }
                return 1;

            }
        });

        String format = "%7s|%-15s|%7s";

        System.out.println(String.format(format, "SID", "Name", "GPA"));

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(String.format(format, studentList.get(i).getId(), studentList.get(i).getName(),
                    studentList.get(i).getGPA()));
        }
    }
}