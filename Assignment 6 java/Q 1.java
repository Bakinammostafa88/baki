class Student {
    private String studentID;
    private String studentName;
    private double GPA;

    public Student() {
        this.studentID = "000";
        this.studentName = "Unknown";
        this.GPA = 0.0;
    }

    public Student(String studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("202601", "Omar Ali", 3.4);
        Student s2 = new Student();

        s2.setGPA(3.8);

        System.out.println("Student 1: ID = " + s1.getStudentID() +
                           ", Name = " + s1.getStudentName() +
                           ", GPA = " + s1.getGPA() +
                           ", Honor Student = " + s1.isHonorStudent());

        System.out.println("Student 2: ID = " + s2.getStudentID() +
                           ", Name = " + s2.getStudentName() +
                           ", GPA = " + s2.getGPA() +
                           ", Honor Student = " + s2.isHonorStudent());
    }
}