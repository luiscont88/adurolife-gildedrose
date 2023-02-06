package com.adurolife.gildedrose.domain;

/**
 * @author Luis Contreras
 */
public class NormalItem implements Updatable {

    private final Item item;

    public NormalItem(String name, int sellIn, int quality) {

        this.item = new Item(name, sellIn, quality);

    }

    @Override
    public String toString() {

        return item.toString();

    }

    Item getItem() {

        return this.item;

    }

    public String getName() {

        return item.getName();

    }

    public int getSellIn() {

        return item.getSellIn();

    }

    void setSellIn() {

        item.setSellIn();

    }

    public int getQuality() {

        return item.getQuality();

    }

    void computeQuality(int value) {

        if (getQuality() + value > 50) {
            item.setQuality(50);
        } else {
            item.setQuality(Math.max(getQuality() + value, 0));
        }

    }

    @Override
    public void updateQuality() {

        if (getSellIn() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        setSellIn();

    }
}