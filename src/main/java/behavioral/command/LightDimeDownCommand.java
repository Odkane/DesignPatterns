package behavioral.command;

import static behavioral.command.LightBulb.getInstance;

public class LightDimeDownCommand implements Command{
    LightBulb bulb = getInstance();

    @Override
    public void execute() {
        bulb.lightDimeDown();
    }

    @Override
    public void unexecute() {
        bulb.lightDimeUp();
    }
}
