package info.miguelcatalan.headfirst.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    List<String> getBreakFastMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        return printMenu(pancakeIterator);
    }

    List<String> getLunchMenu() {
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        return printMenu(dinerIterator);
    }

    List<String> getMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        List<String> menu = printMenu(pancakeIterator);
        menu.addAll(printMenu(dinerIterator));
        return menu;
    }

    private List<String> printMenu(Iterator iterator) {
        List<String> menu = new ArrayList<String>();
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            menu.add(menuItem.toString());
            System.out.println(menuItem.toString());
        }
        return menu;
    }

}
