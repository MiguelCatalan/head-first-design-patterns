package info.miguelcatalan.headfirst.designpatterns.composite;

class DessertsMenu extends Menu {

    DessertsMenu(String name, String description) {
        super(name, description);
        menuComponents.add(new MenuItem("Apple pie",
                1.59,
                "Apple pie with flakey crust, topped with vanilla icecream",
                true));
    }
}
