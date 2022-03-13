package behavioral.command;

import static behavioral.command.LightBulb.getInstance;

public class LightOffCommand implements Command{
    LightBulb bulb = getInstance();

    @Override
    public void execute() {
        bulb.lightOff();
    }

    @Override
    public void unexecute() {
        bulb.lightOn();
    }
}
