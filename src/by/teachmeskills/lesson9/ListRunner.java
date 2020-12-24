package by.teachmeskills.lesson9;

import java.util.*;

/**
 * @author Dzmitry Fursevich
 */
public class ListRunner {
    public static void main(String[] args) {
        String[] arrayStrings = new String[] {"First", "Second"};

        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        list.remove("Second");
        System.out.println(list.toString());

        list.add("Forth");
        list.add(0, "First0");
        System.out.println(list.toString());

        list.set(0, "First1");
        System.out.println(list.toString());

        boolean hasFirst1 = list.contains("First1");
        System.out.println("hasFirst1 = " + hasFirst1);

        List<String> subList = new ArrayList<>();
        subList.add("First1");
        subList.add("Third1");

        boolean containsAll = list.containsAll(subList);
        System.out.println("containsAll = " + containsAll);
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        System.out.println("-------------");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("-------------");
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println("item = " + item);
        }
    }
}
