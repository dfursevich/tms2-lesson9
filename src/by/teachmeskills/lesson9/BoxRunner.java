package by.teachmeskills.lesson9;

import java.util.Random;

/**
 * @author Dzmitry Fursevich
 */
public class BoxRunner {
    public static void main(String[] args) {
        Box<String, String> box = new Box<String, String>("hello", "itme2");

        Box<Random, String> boxRandom = new Box<Random, String>(new Random(), "hello");

        Box<Boolean, Integer> boxBoolean = new Box<Boolean, Integer>(true, 1);
    }
}
