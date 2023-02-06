package com.adurolife.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Luis Contreras
 */
public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName());
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        System.out.println("Sulfuras toString() test");
        System.out.println(sulfuras.toString());
    }

    @Test
    public void updateQualitySulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.updateQuality();
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
