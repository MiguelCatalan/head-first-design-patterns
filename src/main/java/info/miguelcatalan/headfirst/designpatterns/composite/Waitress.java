package info.miguelcatalan.headfirst.designpatterns.composite;

import java.util.List;

class Waitress {
    private MenuComponent allMenus;

    Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    List<String> getMenus() {
        return allMenus.getItems();
    }
}
