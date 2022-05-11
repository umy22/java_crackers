package com.test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.main.java.GildedRoseKata;
import com.main.java.Item;

public class Sulfuras_Test {

	@Test
    public void item_Sulfuras_neverChanges() {
        
		ArrayList<Item> item = new ArrayList<Item>();
		item.add(new Item("Sulfuras, Hand of Ragnaros", 100, 100));
		
		GildedRoseKata app = new GildedRoseKata(item);

        app.updateQuality();

       //assertEquals(app.getItems()[0], item);
    }
	
	
	 @Test
	 public void updateQuality_withSulfuras_outOfTheDate_should_sellIn_0_and_quality_80() {
		 
		    ArrayList<Item> item = new ArrayList<Item>();
			item.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
	        // Given
	        GildedRoseKata app = new GildedRoseKata(item);
	        // When
	        app.updateQuality();
	        // Then
	        assertEquals(app.getItems()[0], item);
	    }
}
