package info.miguelcatalan.headfirst.designpatterns.iterator;

import java.util.Iterator;

interface Menu {
    Iterator<MenuItem> createIterator();
}
