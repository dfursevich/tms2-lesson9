package by.teachmeskills.lesson9.good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dzmitry Fursevich
 */
public class GoodRunner {
    public static void main(String[] args) {
        List<Good> goods = new ArrayList<>();
        goods.add(new Good(1));


        int index = goods.indexOf(new Good(1));
        Good searchedGood = goods.get(index);

    }
}
