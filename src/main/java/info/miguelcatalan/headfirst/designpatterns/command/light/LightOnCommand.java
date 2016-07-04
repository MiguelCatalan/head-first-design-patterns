package info.miguelcatalan.headfirst.designpatterns.command.light;

import info.miguelcatalan.headfirst.designpatterns.command.Command;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
