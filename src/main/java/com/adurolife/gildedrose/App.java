package com.adurolife.gildedrose;

import com.adurolife.gildedrose.domain.*;

import java.util.List;

/**
 * @author Luis Contreras
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to AduroLife inn!");

        GildedRose shop = new GildedRose();

        /*
          Arrived items and adds them to the inventory.
         */
        List<Updatable> items = List.of(
                new NormalItem("+5 Dexterity Vest", 10, 20),
                new AgedBrie("Aged Brie", 2, 0),
                new NormalItem("Elixir of the Mongoose", 5, 7),
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49));

        for (Updatable item : items) {
            shop.addItem(item);
        }

        /*
          AduroLife lists the inventory
         */
        System.out.println("\t ####  DAY 1 ####");
        System.out.println(shop);

        /*
          One day is gone, inventory updated
         */
        shop.updateQuality();

        /*
          AduroLife lists the inventory
         */
        System.out.println("\t ####  DAY 2 ####");
        System.out.println(shop);

        /*
          New item type Conjured just arrived.
          Add it to the inventory:
          Polymorphism in action
         */
        shop.addItem(new Conjured("Conjured Mana Cake", 3, 6));
        System.out.println("\t ####  New item conjured added ####");
        System.out.println(shop);

        /*
          Another day is gone, inventory updated
         */
        shop.updateQuality();
        System.out.println("\t ####  DAY 3 ####");
        System.out.println(shop);
    }

}
