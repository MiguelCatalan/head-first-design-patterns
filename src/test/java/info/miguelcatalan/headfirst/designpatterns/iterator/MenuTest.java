package info.miguelcatalan.headfirst.designpatterns.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MenuTest {

    @Test
    public void shouldReturnBreakFastMenu() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        assertTrue(waitress.getBreakFastMenu().containsAll(getRightBreakfastMenu()));
    }

    @Test
    public void shouldReturnLunchMenu() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        assertTrue(waitress.getLunchMenu().containsAll(getRightLunchMenu()));
    }

    @Test
    public void shouldReturnMenu() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        assertTrue(waitress.getMenu().containsAll(getRightMenu()));
    }


    private List<String> getRightBreakfastMenu() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add(new MenuItem("K&B's Pancake Breakfast",
                2.99d,
                "Pancake with scrambled eggs, and toast",
                true).toString());
        menuItems.add(new MenuItem("Regular Pancake Breakfast",
                2.99d,
                "Pancake with fried eggs, and toast",
                false).toString());
        menuItems.add(new MenuItem("Blueberry Pancakes",
                3.49d,
                "Pancakes made with fresh blueberries",
                true).toString());
        menuItems.add(new MenuItem("Waffles",
                3.59d,
                "Waffles with your choice of blueberries or strawberries",
                true).toString());
        return menuItems;
    }

    private List<String> getRightLunchMenu() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add(new MenuItem("Vegetarian",
                2.99d,
                "(Fankin') Bacon with lettuce & tomato on whole wheat",
                true).toString());
        menuItems.add(new MenuItem("BLT",
                2.99d,
                "Bacon with lettuce & tomato on whole wheat",
                false).toString());
        menuItems.add(new MenuItem("Soup of the day",
                3.29d,
                "Soup of the day with a side of potato salad",
                false).toString());
        return menuItems;
    }

    private List<String> getRightMenu() {
        List<String> menuItems = getRightBreakfastMenu();
        menuItems.addAll(getRightLunchMenu());
        return menuItems;
    }
}
