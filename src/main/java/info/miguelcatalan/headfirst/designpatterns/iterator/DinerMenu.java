package info.miguelcatalan.headfirst.designpatterns.iterator;

import java.util.Iterator;

class DinerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private final MenuItem[] menuItems;
    private int numberOfItems = 0;

    DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian", 2.99d, "(Fankin') Bacon with lettuce & tomato on whole wheat", true);
        addItem("BLT", 2.99d, "Bacon with lettuce & tomato on whole wheat", false);
        addItem("Soup of the day", 3.29d, "Soup of the day with a side of potato salad", false);
    }

    private void addItem(String name, double price, String description, boolean isVegetarian) {
        MenuItem menuItem = new MenuItem(name, price, description, isVegetarian);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry menu is full!! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
