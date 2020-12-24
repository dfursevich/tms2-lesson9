package by.teachmeskills.lesson9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Dzmitry Fursevich
 */
public class SetRunner {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("First");
        set.add("Second");
        set.add("Third");
        System.out.println(set);

        set.add("Third");
        System.out.println(set);

//        List<String> list = new LinkedList<>();
//        list.add("First");
//        list.add("Second");
//        list.add("Third");
//        list.add("Third");
//        System.out.println(list.toString());

        boolean containsFirst = set.contains("First");
        System.out.println("containsFirst = " + containsFirst);

        set.remove("First");
        System.out.println(set);

        System.out.println("-------------");
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("-------------");
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
