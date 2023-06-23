package Entities;

import Entities.BaseMerchandise;
import Entities.Imerchandise;

import java.util.Objects;

public class GiftCard extends BaseMerchandise implements Imerchandise {
    String feature = "Gift Card";
    int price = 25;
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
        GiftCard giftCard = (GiftCard) o;
        return price == giftCard.price && Objects.equals(feature, giftCard.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
