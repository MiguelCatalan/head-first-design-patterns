package info.miguelcatalan.headfirst.designpatterns.facade;

class PopcornPopper {

    private boolean isOn;
    private boolean isPopping;

    PopcornPopper() {
        this.isOn = false;
        this.isPopping = false;
    }

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    boolean isOn() {
        return isOn;
    }

    void pop() {
        if (isOn) {
            isPopping = true;
        }
    }

    boolean isPopping() {
        return isPopping;
    }
}
