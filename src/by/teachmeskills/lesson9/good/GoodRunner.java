package by.teachmeskills.lesson9.good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class GoodRunner {
    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();
        goods.add(new Good(1, "apple", 10));
        goods.add(new Good(2, "chair", 100));
        goods.add(new Good(3, "sugar", 15));

        int index = goods.indexOf(new Good(2));
        System.out.println("index = " + index);
    }
}
