package info.miguelcatalan.headfirst.designpatterns.composite;

class PancakeMenu extends Menu {
    PancakeMenu(String name, String description) {
        super(name, description);
        menuComponents.add(new MenuItem("K&B's Pancake Breakfast",
                2.99d,
                "Pancake with scrambled eggs, and toast",
                true));
        menuComponents.add(new MenuItem("Regular Pancake Breakfast",
                2.99d,
                "Pancake with fried eggs, and toast",
                false));
        menuComponents.add(new MenuItem("Blueberry Pancakes",
                3.49d,
                "Pancakes made with fresh blueberries",
                true));
        menuComponents.add(new MenuItem("Waffles",
                3.59d,
                "Waffles with your choice of blueberries or strawberries",
                true));
    }
}
