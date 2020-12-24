package by.teachmeskills.lesson9;

import java.util.Comparator;

/**
 * @author Dzmitry Fursevich
 */
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
