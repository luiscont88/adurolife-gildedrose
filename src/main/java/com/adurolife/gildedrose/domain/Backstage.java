package com.adurolife.gildedrose.domain;

/**
 * @author Luis Contreras
 */
public class Backstage extends NormalItem {

    public Backstage(String name, int sellIn, int quality) {

        super(name, sellIn, quality);

    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 10) {
            computeQuality(1);
        }
        else if (getSellIn() > 5) {
            computeQuality(2);
        }
        else if (getSellIn() > 0) {
            computeQuality(3);
        }
        else {
            /*
              class Backstage should only have a reason to change
              Changes in Backstage quality rules should be only reflected
              in the class Backstage, not in NormalItem.
             */
            getItem().setQuality(0);
        }
        setSellIn();
    }

}