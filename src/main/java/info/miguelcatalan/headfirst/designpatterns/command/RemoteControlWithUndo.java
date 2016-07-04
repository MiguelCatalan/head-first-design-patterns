package info.miguelcatalan.headfirst.designpatterns.command;

class RemoteControlWithUndo {

    private static final int MAX_NUM_SLOTS = 4;

    private Command[] commandsInColumnA;
    private Command[] commandsInColumnB;
    private Command lastCommand;

    RemoteControlWithUndo() {
        commandsInColumnA = new Command[MAX_NUM_SLOTS];
        commandsInColumnB = new Command[MAX_NUM_SLOTS];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < MAX_NUM_SLOTS; i++) {
            commandsInColumnA[i] = noCommand;
            commandsInColumnB[i] = noCommand;
        }
    }

    Command getCommandInSlot(int slot, int column) {

        Command command;
        if (column == 0) {
            command = commandsInColumnA[slot];
        } else {
            command = commandsInColumnB[slot];
        }

        return command;
    }

    void setCommandSlot(int slot, Command commandA, Command commandB) {
        commandsInColumnA[slot] = commandA;
        commandsInColumnB[slot] = commandB;
    }

    void onButtonAWasPressed(int slot) {
        commandsInColumnA[slot].execute();
        lastCommand = commandsInColumnA[slot];
    }

    void onButtonBWasPressed(int slot) {
        commandsInColumnB[slot].execute();
        lastCommand = commandsInColumnB[slot];
    }

    void onUndoButtonPressed() {
        lastCommand.undo();
    }
}
