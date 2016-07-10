package info.miguelcatalan.headfirst.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    private String description;
    private String name;

    Menu(String name, String description) {
        this.description = description;
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int position) {
        return menuComponents.get(position);
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
    public List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add(getName() + ", " + getDescription());
        print(getName() + ", " + getDescription());
        for (MenuComponent component : menuComponents) {
            items.addAll(component.getItems());
        }
        return items;
    }
}
