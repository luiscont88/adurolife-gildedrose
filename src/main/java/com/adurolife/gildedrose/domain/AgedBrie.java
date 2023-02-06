package com.adurolife.gildedrose.domain;

/**
 * @author Luis Contreras
 */
public class AgedBrie extends NormalItem {

    public AgedBrie(String name, int sellIn, int quality) {

        super(name, sellIn, quality);

    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 0) {
            computeQuality(1);
        } else {
            computeQuality(2);
        }
        setSellIn();
    }

}