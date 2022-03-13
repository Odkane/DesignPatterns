package behavioral.command;

import static behavioral.command.LightBulb.getInstance;

public class LightOnCommand implements Command{
    LightBulb bulb = getInstance();

    @Override
    public void execute() {
        bulb.lightOn();
    }

    @Override
    public void unexecute() {
        bulb.lightOff();
    }
}
