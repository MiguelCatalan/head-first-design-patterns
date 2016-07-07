package info.miguelcatalan.headfirst.designpatterns.template;

class Coffee extends CaffeineBeverage {
    void brew() {
        System.out.println("Dripping coffee through filter");
        steps.add("Drip coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
        steps.add("Add sugar and milk");
    }
}
