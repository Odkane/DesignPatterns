package behavioral.command;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

//Invoker
public class Switcher {
    private final Command lightOn;
    private final Command lightOff;
    private final Command dimeUp;
    private final Command dimeDown;
    private final Queue<Command> commandQueue = Collections.asLifoQueue(new ArrayDeque<>());

    public Switcher() {
        this.lightOn = new LightOnCommand();
        this.lightOff = new LightOffCommand();
        this.dimeUp = new LightDimeUpCommand();
        this.dimeDown = new LightDimeDownCommand();
    }

    void pressOn(){
        commandQueue.add(lightOn);
        lightOn.execute();
    }

    void pressOff(){
        commandQueue.add(lightOff);
        lightOff.execute();
    }

    void pressDimeUp(){
        commandQueue.add(dimeUp);
        dimeUp.execute();
    }

    void pressDimeDown(){
        commandQueue.add(dimeDown);
        dimeDown.execute();
    }

    void pressRedo(){
        if (!commandQueue.isEmpty()){
            commandQueue.poll().unexecute();
        }
    }
}
