package creational.singleton.enumimplementation;

public enum EnumImplementation {
    INSTANCE;

    public void getConfiguration(){
        // do something.....
    }

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
