package Entities;

import Entities.BaseMerchandise;
import Entities.Imerchandise;

import java.util.Objects;

public class Mug extends BaseMerchandise implements Imerchandise {
    String feature = "Entities.Mug";
    int price = 30;
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
        Mug mug = (Mug) o;
        return price == mug.price && Objects.equals(feature, mug.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
