import java.util.Arrays;

public class ARQuestion3 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(), new Student("Abinaya"), new Student("King"), new Student("Queen"),
                new Student()};
        Arrays.stream(students).forEach(student -> {
            System.out.println(student.toString());
        });
    }

}

class Student {
    private String studentName;

    public Student() {
        this.studentName = "UNKNOWN";
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}
