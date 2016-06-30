package info.miguelcatalan.headfirst.designpatterns.observer;

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
