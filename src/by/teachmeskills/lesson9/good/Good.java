package by.teachmeskills.lesson9.good;

import java.util.Objects;

/**
 * @author Dzmitry Fursevich
 */
public class Good {
    private Integer id;
    private String name;
    private Integer price;

    public Good(Integer id) {
        this.id = id;
    }

    public Good(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return id.equals(good.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
