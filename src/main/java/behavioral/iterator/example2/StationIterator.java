package behavioral.iterator.example2;

import java.util.Iterator;

public class StationIterator implements Iterator<RadioStation> {

    protected RadioStation[] stations;
    protected int currentStation = 0;

    public StationIterator(RadioStation[] stations) {
        this.stations = stations;
    }

    @Override
    public boolean hasNext() {
        return (currentStation < stations.length && stations[currentStation] != null);
    }

    @Override
    public RadioStation next() {
        return stations[currentStation++];
    }
}