package info.miguelcatalan.headfirst.designpatterns.singleton;

class ChocolateBoiler {

    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
    }

    static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }

        return uniqueInstance;
    }
}
