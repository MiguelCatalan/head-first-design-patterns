package info.miguelcatalan.headfirst.designpatterns.command;

import info.miguelcatalan.headfirst.designpatterns.command.fan.CeilingFanHighCommand;
import info.miguelcatalan.headfirst.designpatterns.command.fan.CeilingFanMediumCommand;
import info.miguelcatalan.headfirst.designpatterns.command.light.LightOffCommand;
import info.miguelcatalan.headfirst.designpatterns.command.light.LightOnCommand;
import info.miguelcatalan.headfirst.designpatterns.command.fan.CeilingFan;
import info.miguelcatalan.headfirst.designpatterns.command.light.Light;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RemoteLoaderTest {

    @Test
    public void shouldRemoteControlHaveNoCommandsInTheInitialization() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();

        assertThat(remote.getCommandInSlot(0, 0), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(0, 1), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(1, 0), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(1, 1), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(2, 0), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(2, 1), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(3, 0), instanceOf(NoCommand.class));
        assertThat(remote.getCommandInSlot(3, 1), instanceOf(NoCommand.class));
    }

    @Test
    public void shouldRemoteControlHaveACommandsInTheFirstSlot() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        assertThat(remote.getCommandInSlot(0, 0), instanceOf(LightOnCommand.class));
        assertThat(remote.getCommandInSlot(0, 1), instanceOf(LightOffCommand.class));
    }

    @Test
    public void shouldBeTheLivingRoomLightOnIfTheButtonAtFirst() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        assertTrue("Light is on a it should be off", livingRoomLight.getCurrentState() == Light.State.OFF);
    }

    @Test
    public void shouldBeTheLivingRoomLightOnIfTheButtonAIsPressed() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        remote.onButtonAWasPressed(0);

        assertTrue("Light is off a it should be on", livingRoomLight.getCurrentState() == Light.State.ON);
    }

    @Test
    public void shouldBeTheLivingRoomLightOffIfTheButtonBIsPressed() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        remote.onButtonAWasPressed(0);
        remote.onButtonBWasPressed(0);

        assertTrue("Light is on a it should be off", livingRoomLight.getCurrentState() == Light.State.OFF);
    }

    @Test
    public void shouldBeTheLivingRoomLightOffIfTheUndoButtonIsPressedAfterTheA() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        remote.onButtonAWasPressed(0);
        remote.onUndoButtonPressed();

        assertTrue("Light is on a it should be off", livingRoomLight.getCurrentState() == Light.State.OFF);
    }

    @Test
    public void shouldBeTheLivingRoomLightOnIfTheUndoButtonIsPressedAfterTheB() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        remote.setCommandSlot(0, lightOn, lightOff);

        remote.onButtonBWasPressed(0);
        remote.onUndoButtonPressed();

        assertTrue("Light is off a it should be on", livingRoomLight.getCurrentState() == Light.State.ON);
    }

    @Test
    public void shouldTheCeilingFanTurnedOffAtStart() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        CeilingFan livingRoomFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        remote.setCommandSlot(0, ceilingFanHigh, ceilingFanMedium);

        assertTrue("Fan is on a it should be off", livingRoomFan.getCurrentState() == CeilingFan.State.OFF);
    }

    @Test
    public void shouldTheCeilingFanSpeedBeHighAfterPressA() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        CeilingFan livingRoomFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        remote.setCommandSlot(0, ceilingFanHigh, ceilingFanMedium);

        remote.onButtonAWasPressed(0);

        assertTrue("Fan is not set to high", livingRoomFan.getCurrentState() == CeilingFan.State.HIGH);
    }

    @Test
    public void shouldTheCeilingFanSpeedBeOffAfterPressUndoAndA() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        CeilingFan livingRoomFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        remote.setCommandSlot(0, ceilingFanHigh, ceilingFanMedium);

        remote.onButtonAWasPressed(0);
        remote.onUndoButtonPressed();

        assertTrue("Fan is not turned off", livingRoomFan.getCurrentState() == CeilingFan.State.OFF);
    }

    @Test
    public void shouldTheCeilingFanSpeedBeMediumAfterPressB() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        CeilingFan livingRoomFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        remote.setCommandSlot(0, ceilingFanHigh, ceilingFanMedium);

        remote.onButtonBWasPressed(0);

        assertTrue("Fan is not set to medium", livingRoomFan.getCurrentState() == CeilingFan.State.MEDIUM);
    }

    @Test
    public void shouldTheCeilingFanSpeedBeOffAfterPressUndoAndB() {
        RemoteControlWithUndo remote = new RemoteControlWithUndo();
        CeilingFan livingRoomFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        remote.setCommandSlot(0, ceilingFanHigh, ceilingFanMedium);

        remote.onButtonBWasPressed(0);
        remote.onUndoButtonPressed();

        assertTrue("Fan is not turned off", livingRoomFan.getCurrentState() == CeilingFan.State.OFF);
    }
}
