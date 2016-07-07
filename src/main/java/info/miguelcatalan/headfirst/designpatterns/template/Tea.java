package info.miguelcatalan.headfirst.designpatterns.template;

class Tea extends CaffeineBeverage {
    void brew() {
        System.out.println("Steeping tea");
        steps.add("Steep tea");
    }

    void addCondiments() {
        System.out.println("Adding some lemon");
        steps.add("Add some lemon");
    }
}
