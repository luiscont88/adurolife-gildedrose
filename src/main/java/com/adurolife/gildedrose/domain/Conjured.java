package com.adurolife.gildedrose.domain;

/**
 * @author Luis Contreras
 */
public class Conjured extends NormalItem {

    public Conjured(String name, int sellIn, int quality) {

        super(name, sellIn, quality);

    }

    @Override
    public void updateQuality() {

        if (getSellIn() > 0) {
            computeQuality(-2);
        } else {
            computeQuality(-4);
        }
        setSellIn();
    }

}