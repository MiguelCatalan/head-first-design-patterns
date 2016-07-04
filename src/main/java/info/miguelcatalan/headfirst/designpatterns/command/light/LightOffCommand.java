package info.miguelcatalan.headfirst.designpatterns.command.light;

import info.miguelcatalan.headfirst.designpatterns.command.Command;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
