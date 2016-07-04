package info.miguelcatalan.headfirst.designpatterns.command.fan;

import info.miguelcatalan.headfirst.designpatterns.command.Command;

public class CeilingFanMediumCommand implements Command {
    private final CeilingFan ceilingFan;
    private CeilingFan.State previousState;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        previousState = ceilingFan.getCurrentState();
        ceilingFan.medium();
    }

    public void undo() {
        switch (previousState) {
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}
