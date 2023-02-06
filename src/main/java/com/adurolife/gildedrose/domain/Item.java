package com.adurolife.gildedrose.domain;

/**
 * @author Luis Contreras
 */
final class Item {

    private final String name;
    private int sellIn;
    private int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    /**
     * Returns a brief description of the Item. 
     * The exact details of the representation are unspecified
     * and subject to change, but the following may be regarded
     * as typical.
     * [name=Sulfuras, sellIn=10, quality=20]"
     */
    @Override
    public String toString() {
        return "name=" + getName() +
                ", sellIn=" + getSellIn() +
                ", quality=" + getQuality();
    }

    String getName() {

        return this.name;

    }

    int getSellIn() {

        return this.sellIn;

    }

    void setSellIn() {

        this.sellIn = this.getSellIn() - 1;

    }

    int getQuality() {

        return this.quality;

    }

    void setQuality(int value) {

        this.quality = value;

    }
}