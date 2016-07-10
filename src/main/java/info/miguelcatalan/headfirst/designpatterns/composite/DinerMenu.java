package info.miguelcatalan.headfirst.designpatterns.composite;

class DinerMenu extends Menu {

    DinerMenu(String name, String description) {
        super(name, description);
        menuComponents.add(new MenuItem("Vegetarian",
                2.99d,
                "(Fankin') Bacon with lettuce & tomato on whole wheat",
                true));
        menuComponents.add(new MenuItem("BLT",
                2.99d,
                "Bacon with lettuce & tomato on whole wheat",
                false));
        menuComponents.add(new MenuItem("Soup of the day",
                3.29d,
                "Soup of the day with a side of potato salad",
                false));
    }
}
