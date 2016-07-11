package info.miguelcatalan.headfirst.designpatterns.state;

interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
