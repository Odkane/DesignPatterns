package behavioral.iterator.example2;

public class RadioStation {
    private final String name;
    private final String frequency;


    public RadioStation(String name, String frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getFrequency() {
        return frequency;
    }
}