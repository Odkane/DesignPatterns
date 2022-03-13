package behavioral.command;

import static behavioral.command.LightBulb.getInstance;

public class LightDimeUpCommand implements Command{
    LightBulb bulb = getInstance();

    @Override
    public void execute() {
        bulb.lightDimeUp();
    }

    @Override
    public void unexecute() {
        bulb.lightDimeDown();
    }
}
