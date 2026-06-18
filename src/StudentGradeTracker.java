import java.util.ArrayList;
import java.util.Scanner;

// Class to store student details
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== STUDENT GRADE TRACKER =====");

        // INPUT NUMBER OF STUDENTS
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // INPUT DATA
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        // CALCULATIONS
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (Student s : students) {
            sum += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
            }
        }

        double average = (double) sum / n;

        // OUTPUT REPORT
        System.out.println("\n===== STUDENT REPORT =====");

        for (Student s : students) {
            System.out.println("Name: " + s.name + " | Marks: " + s.marks);
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}