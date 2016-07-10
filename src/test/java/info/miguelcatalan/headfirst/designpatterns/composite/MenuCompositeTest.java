package info.miguelcatalan.headfirst.designpatterns.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;


public class MenuCompositeTest {

    @Test
    public void shouldReturnBreakFastMenu() {
        MenuComponent pancakeHouseMenu = new PancakeMenu("PANCAKE HOUSE MENU", "Breakfast");

        Waitress waitress = new Waitress(pancakeHouseMenu);
        assertTrue(waitress.getMenus().containsAll(getRightBreakfastMenu()));
    }

    @Test
    public void shouldReturnLunchMenu() {
        MenuComponent dinerMenu = new DinerMenu("DINER MENU", "Lunch");

        Waitress waitress = new Waitress(dinerMenu);
        assertTrue(waitress.getMenus().containsAll(getRightLunchMenu()));
    }

    @Test
    public void shouldReturnDessertMenu() {
        MenuComponent dessertsMenu = new DessertsMenu("DESSERT MENU", "Sweets desserts!");

        Waitress waitress = new Waitress(dessertsMenu);
        assertTrue(waitress.getMenus().containsAll(getRightDessertsMenu()));
    }

    @Test
    public void shouldReturnMenu() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        MenuComponent pancakeHouseMenu = new PancakeMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new DinerMenu("DINER MENU", "Lunch");
        MenuComponent dessertsMenu = new DessertsMenu("DESSERT MENU", "Sweets desserts!");
        allMenus.add(pancakeHouseMenu);
        dinerMenu.add(dessertsMenu);
        allMenus.add(dinerMenu);

        Waitress waitress = new Waitress(allMenus);
        assertTrue(waitress.getMenus().containsAll(getRightMenu()));
    }

    private List<String> getRightBreakfastMenu() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add("PANCAKE HOUSE MENU, Breakfast");
        menuItems.add("K&B's Pancake Breakfast, 2.99 -- Pancake with scrambled eggs, and toast");
        menuItems.add("Regular Pancake Breakfast, 2.99 -- Pancake with fried eggs, and toast");
        menuItems.add("Blueberry Pancakes, 3.49 -- Pancakes made with fresh blueberries");
        menuItems.add("Waffles, 3.59 -- Waffles with your choice of blueberries or strawberries");
        return menuItems;
    }

    private List<String> getRightLunchMenu() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add("DINER MENU, Lunch");
        menuItems.add("Vegetarian, 2.99 -- (Fankin') Bacon with lettuce & tomato on whole wheat");
        menuItems.add("BLT, 2.99 -- Bacon with lettuce & tomato on whole wheat");
        menuItems.add("Soup of the day, 3.29 -- Soup of the day with a side of potato salad");
        return menuItems;
    }

    private List<String> getRightDessertsMenu() {
        List<String> menuItems = new ArrayList<String>();
        menuItems.add("DESSERT MENU, Sweets desserts!");
        menuItems.add("Apple pie, 1.59 -- Apple pie with flakey crust, topped with vanilla icecream");
        return menuItems;
    }

    private Set<String> getRightMenu() {
        Set<String> menuItems = new LinkedHashSet<String>();
        menuItems.add("ALL MENUS, All menus combined");
        menuItems.addAll(getRightBreakfastMenu());
        menuItems.addAll(getRightLunchMenu());
        menuItems.addAll(getRightDessertsMenu());
        return menuItems;
    }
}
