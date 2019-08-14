package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void quality_degrades_twice_as_fast_past_sell_date() {
        int initQuality = 10;
        Item[] items = new Item[] { new Item("foo", 0, initQuality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("quality degrades twice as fast past sell date", app.items[0].quality == initQuality - 2);
    }

    @Test
    public void quality_never_negative() {
        Item[] items = new Item[] { new Item("foo", 10, 0), new Item("bar", 10, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        for (Item item : app.items) {
            assertTrue("quality never negative", item.quality >= 0);
        }
    }

    @Test
    public void old_brie() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is a higher quality",app.items[0].quality>1 );
        
    }
    @Test
    public void never_over_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("brie is higher quality than it should be able to",app.items[0].quality==50 );
        
    }
}
