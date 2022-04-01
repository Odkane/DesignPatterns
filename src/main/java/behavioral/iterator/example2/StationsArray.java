package behavioral.iterator.example2;

import java.util.Iterator;

public class StationsArray implements Iterable<RadioStation> {
    protected static int MAX_STATIONS = 10;
    protected int totalStations = 0;
    protected RadioStation[] stations;

    public StationsArray() {
        super();
        stations = new RadioStation[MAX_STATIONS];
    }

    public StationsArray(RadioStation[] stations) {
        this.stations = stations;
    }

    public boolean addRadioStation(String name, String frequency) {
        var station = new RadioStation(name, frequency);
        if (totalStations < (MAX_STATIONS - 1)) {
            stations[totalStations++] = station;
            return true;
        } else {
            System.out.println("RadioStationArray can't accept any more stations!");
            return false;
        }
    }

    public boolean addRadioStation(RadioStation station) {
        if (totalStations < (MAX_STATIONS - 1)) {
            stations[totalStations++] = station;
            return true;
        } else {
            System.out.println("RadioStationArray can't accept any more stations!");
            return false;
        }
    }

    public RadioStation[] getStations() {
        return stations;
    }

    @Override
    public Iterator<RadioStation> iterator() {
        return new StationIterator(stations);
        // or simply use the below line to avoid writing explicit implementation of the iterator class.
        // return Arrays.stream(stations).iterator();
    }
}