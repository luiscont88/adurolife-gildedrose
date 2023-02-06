package com.adurolife.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luis Contreras
 */
public class GildedRose {

    private final List<Updatable> inventory = new ArrayList<>();

    public List<Updatable> getInventory() {

        return this.inventory;

    }

    public void addItem(Updatable item) {

        getInventory().add(item);

    }

    public void updateQuality() {

        for (Updatable item : getInventory()) {
            item.updateQuality();
        }

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
        StringBuilder representation = new StringBuilder();
        for (Updatable item : getInventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }

}