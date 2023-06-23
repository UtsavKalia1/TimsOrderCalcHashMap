package Entities;


import java.util.Objects;

public class Coffee extends BaseMerchandise implements Imerchandise {
    String feature = "Entities.Coffee";
    int price = 40;
    @Override
    public String getFeature() {
        return feature;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString(){
        return getFeature() + "has price"+ getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return price == coffee.price && Objects.equals(feature, coffee.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
