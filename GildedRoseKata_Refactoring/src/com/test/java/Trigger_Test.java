package com.test.java;

import java.util.ArrayList;

import com.main.java.GildedRoseKata;
import com.main.java.Item;

public class Trigger_Test {

	public static void main(String[] args) {
		
		
		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
		items.add(new Item("Conjured Mana Cake", 2, 5));
        
        GildedRoseKata app = new GildedRoseKata(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
	}
}
