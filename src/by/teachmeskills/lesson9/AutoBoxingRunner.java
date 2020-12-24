package by.teachmeskills.lesson9;

/**
 * @author Dzmitry Fursevich
 */
public class AutoBoxingRunner {
    public static void main(String[] args) {
        int a = 10;
        Integer aType = a;
        int b = aType;

        Integer c = null;

        int d = c;
    }
}
