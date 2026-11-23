import java.util.Scanner;

class Student {
    private String studentName;
    private String studentID;
    private double grade;

    // Unparameterized constructor
    public Student() {
        this.studentName = "";
        this.studentID = "";
        this.grade = 0.0;
    }

    // Parameterized constructor
    public Student(String studentName, String studentID, double grade) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grade = grade;
    }

    // Updates the student's grade
    public void updateGrade(double newGrade) {
        this.grade = newGrade;
    }

    // Returns true if grade >= 50, false otherwise
    public boolean isPassed() {
        return this.grade >= 50.0;
    }

    // Accessor (getter) methods
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGrade() {
        return grade;
    }
}

class StudentArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + i + " ---");
            System.out.print("Student ID: ");
            String id = scanner.nextLine();

            System.out.print("Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume leftover newline

            students[i] = new Student(name, id, grade);
        }

        if (n > 0) {
            System.out.print("\nEnter the index of the student to update (0 to " + (n - 1) + "): ");
            int index = scanner.nextInt();

            if (index >= 0 && index < n) {
                System.out.print("Enter the new grade: ");
                double newGrade = scanner.nextDouble();
                students[index].updateGrade(newGrade);
                System.out.println("Grade updated successfully.");
            } else {
                System.out.println("Invalid index! Skipping grade update.");
            }
        }

        System.out.println("\n=== All Students Summary ===");
        for (int i = 0; i < n; i++) {
            String status = students[i].isPassed() ? "Pass" : "Fail";
            System.out.println(
                "Index [" + i + "] | ID: " + students[i].getStudentID() +
                " | Name: " + students[i].getStudentName() +
                " | Grade: " + students[i].getGrade() +
                " | Status: " + status
            );
        }

        scanner.close();
    }
}