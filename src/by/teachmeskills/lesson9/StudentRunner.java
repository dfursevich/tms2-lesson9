package by.teachmeskills.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 10);
        Student sam = new Student("Sam", 20);

        List<Student> students = new ArrayList<>();
        students.add(tom);
        students.add(sam);

        Student tom2 = new Student("Tom", 10);

        boolean containsTom = students.contains(tom2);
        System.out.println("containsTom = " + containsTom);

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

        Collections.sort(students, new StudentNameComparator());
        System.out.println(students);

        int tom2Index = students.indexOf(tom2);
        System.out.println("tom2Index = " + tom2Index);
    }
}
