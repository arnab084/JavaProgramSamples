import java.util.stream.*;
import java.util.*;

public class StudentFilter
{
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        List<String> list = new ArrayList<>();
         students
                .filter(s-> s.getScore() > passingScore )
                .sorted((p1, p2)->p2.score - p1.score)
                .forEach(obj -> list.add(obj.name));
        return list;
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));
        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}
