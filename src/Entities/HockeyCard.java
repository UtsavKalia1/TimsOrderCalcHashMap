package Entities;

import Entities.BaseMerchandise;
import Entities.Imerchandise;

import java.util.Objects;

public class HockeyCard extends BaseMerchandise implements Imerchandise {
    String feature = "Hockey Card";
    int price = 15;
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
        HockeyCard that = (HockeyCard) o;
        return price == that.price && Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
