package info.miguelcatalan.headfirst.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("K&B's Pancake Breakfast", 2.99d, "Pancake with scrambled eggs, and toast", true));
        menuItems.add(new MenuItem("Regular Pancake Breakfast", 2.99d, "Pancake with fried eggs, and toast", false));
        menuItems.add(new MenuItem("Blueberry Pancakes", 3.49d, "Pancakes made with fresh blueberries", true));
        menuItems.add(new MenuItem("Waffles", 3.59d, "Waffles with your choice of blueberries or strawberries", true));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
