import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];

    // Constructor
    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    // Determine grade
    char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90)
            return 'A';
        else if (avg >= 80)
            return 'B';
        else if (avg >= 70)
            return 'C';
        else if (avg >= 60)
            return 'D';
        else
            return 'F';
    }

    // Display performance report
    void displayReport() {
        System.out.println("\n===== Student Performance Report =====");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Student Name: " + name.toUpperCase());

        System.out.println("Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks : " + calculateTotal());
        System.out.printf("Average     : %.2f%n", calculateAverage());
        System.out.println("Grade       : " + calculateGrade());
        System.out.println("======================================");
    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine().trim();

        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject "
                             + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s = new Student(rollNo, name, marks);
        s.displayReport();

        sc.close();
    }
}
