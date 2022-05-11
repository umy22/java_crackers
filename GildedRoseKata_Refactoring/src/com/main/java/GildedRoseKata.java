package com.main.java;

import java.util.ArrayList;

public class GildedRoseKata {

	public static final String AGED_BRIE = "Aged Brie";
	public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	
	ArrayList<Item> items = new ArrayList<Item>();
	
    public GildedRoseKata(ArrayList<Item> items) {
        this.items = items;
        System.out.println();
    }
    
    public void updateQuality() {
        for (Item item : items) {
	           updateQuality(item);
	           updateSellIn(item);
        }
    }
    
   
    private void updateExpiry(Item item) {
   	 if (item.sellIn < 0) {
            if (!item.name.equals(AGED_BRIE)) {
                if (!item.name.equals(BACKSTAGE_PASSES)) {
                    if (item.quality > 0) {
                        if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        	item.quality = item.quality - 1;
                        }
                    }
                } else {
                	item.quality = item.quality - item.quality;
                }
            } else {
                if (item.quality < 50) {
                	item.quality = item.quality + 1;
                }
            }
        }
    }
    
    private void updateSellIn(Item item) {
    	 if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
         	item.sellIn = item.sellIn - 1;
         	
         }
        updateExpiry(item);
    }
    
    private void updateQuality(Item item) {
    	 if (!item.name.equals(AGED_BRIE)
                 && !item.name.equals(BACKSTAGE_PASSES)) {
             if (item.quality > 0) {
                 if (!item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                 	item.quality = item.quality - 1;
                 }
             }
         } else {
             if (item.quality < 50) {
             	item.quality = item.quality + 1;

                 if (item.name.equals(BACKSTAGE_PASSES)) {
                     if (item.sellIn < 11) {
                         if (item.quality < 50) {
                         	item.quality = item.quality + 1;
                         }
                     }

                     if (item.sellIn < 6) {
                         if (item.quality < 50) {
                         	item.quality = item.quality + 1;
                         }
                     }
                 }
             }
         }
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
}
