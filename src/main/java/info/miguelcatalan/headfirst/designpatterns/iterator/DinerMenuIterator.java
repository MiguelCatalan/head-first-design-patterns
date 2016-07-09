package info.miguelcatalan.headfirst.designpatterns.iterator;

import java.util.Iterator;

class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] list;
    private int position = 0;

    DinerMenuIterator(MenuItem[] menuItems) {
        this.list = menuItems;
    }

    public boolean hasNext() {
        return !(position >= list.length || list[position] == null);
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position++;
        return menuItem;
    }

    public void remove() {
        //nope
    }
}
