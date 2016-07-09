package info.miguelcatalan.headfirst.designpatterns.iterator;

class MenuItem {
    private final String name;
    private final double price;
    private final String description;
    private final boolean isVegetarian;

    MenuItem(String name, double price, String description, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String toString() {
        return getName() + ", " + getPrice() + " -- " + getDescription();
    }
}
