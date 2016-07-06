package info.miguelcatalan.headfirst.designpatterns.facade;

class Screen {
    private boolean isDown;

    Screen() {
        this.isDown = false;
    }

    public void down() {
        isDown = true;
    }

    public void up() {
        isDown = false;
    }

    public boolean isDown() {
        return isDown;
    }
}
