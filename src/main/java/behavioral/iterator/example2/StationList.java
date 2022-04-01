package behavioral.iterator.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StationList implements Iterable<RadioStation> {
    protected List<RadioStation> stationList;

    public StationList() {
        stationList = new ArrayList<>();
    }

    public boolean addRadioStation(String name, String frequency){
        RadioStation radioStation = new RadioStation(name, frequency);
        return stationList.add(radioStation);
    }

    public boolean addRadioStation(RadioStation radioStation){
        return stationList.add(radioStation);
    }

    public List<RadioStation> getStationList() {
        return stationList;
    }

    @Override
    public Iterator<RadioStation> iterator() {
        return stationList.iterator();
    }
}