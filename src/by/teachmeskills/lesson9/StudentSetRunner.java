package by.teachmeskills.lesson9;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Fursevich
 */
public class StudentSetRunner {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("tom", 10));
        students.add(new Student("sam", 20));

        Student tom2 = new Student("tom", 10);
        boolean containsTom2 = students.contains(tom2);
        System.out.println("containsTom2 = " + containsTom2);
    }
}
