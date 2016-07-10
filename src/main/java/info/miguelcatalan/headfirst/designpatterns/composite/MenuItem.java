package info.miguelcatalan.headfirst.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    MenuItem(String name, double price, String description, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add(getName() + ", " + getPrice() + " -- " + getDescription());
        print(getName() + ", " + getPrice() + " -- " + getDescription());
        return items;
    }
}
