import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static double averageWithForEach(List<Student> studentList) {
        int count = 0;
        int sum = 0;
        for (Student student :  studentList) {
            if (student.getGrade() > 5) {
                sum+=student.getGrade();
                count++;
            }
        }

        return sum/count;
    }

    public static double averageWithStream(List<Student> studentList) {
        return studentList.stream()
                .filter(st -> st.getGrade()>5)
                /*.map(st -> st.getGrade()) */ /* Stream<Integer> - has no average method */
                .mapToInt(st->st.getGrade()) /* IntStream - has util methods as average */
                /* .mapToInt(Student::getGrade)* / /* method reference - alternative */
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Andrei", "Mladin", 8);
        Student student2 = new Student(2, "Radu", "Bordea", 5);
        Student student3 = new Student(3, "Rebeka", "Veres", 10);

        List<Student> studentList = Arrays.asList(student1, student2, student3);
        System.out.println("Average with foreach: " + averageWithForEach(studentList));
        System.out.println("Average with stream: " + averageWithStream(studentList));
    }

    public static class Student {
        private int id;
        private String firstName;
        private String lastName;
        private int grade;

        public Student(int id, String firstName, String lastName, int grade) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getGrade() {
            return grade;
        }
    }
}
