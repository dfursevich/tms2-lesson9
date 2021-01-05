package by.teachmeskills.lesson9.good;

/**
 * @author Dzmitry Fursevich
 */
public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addGood(new Good(1, "apple", 10));
        shop.addGood(new Good(2, "chair", 100));
        shop.addGood(new Good(3, "sugar", 15));

        System.out.println(shop.getAllGoods());
    }
}
