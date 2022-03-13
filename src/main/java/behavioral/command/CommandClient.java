package behavioral.command;


public class CommandClient {

    public static void main(String[] args) {
        var switcher = new Switcher();

        switcher.pressOn();
        switcher.pressDimeUp();
        switcher.pressDimeUp();
        switcher.pressDimeUp();
        switcher.pressDimeUp();
        switcher.pressDimeUp();
        switcher.pressDimeUp();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressDimeDown();
        switcher.pressOff();
        switcher.pressRedo();
    }
}
