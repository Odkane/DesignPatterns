package behavioral.iterator.example2;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorClient {

    public static void main(String[] args) {
        RadioStation[] stations = new RadioStation[5];
        stations[0] = new RadioStation("Bounce FM", "91.9FM");
        stations[1] = new RadioStation("Blonded Los Santos", "97.8 FM");
        stations[2] = new RadioStation("Master SOUND", "98.3 FM");
        stations[3] = new RadioStation("CSR", "103.9FM");
        stations[4] = new RadioStation("Radio LOS SANTOS", "106.1 FM");
        StationList list = new StationList();
        StationsArray array = new StationsArray();
        Arrays.stream(stations).forEach(station -> {
            list.addRadioStation(station);
            array.addRadioStation(station);
        });
        System.out.println("Printing the radio stations of the Stations list");
        System.out.println("----------------------------------");
        printRadioStations(list.iterator());
        System.out.println("Printing the radio stations of the Stations array");
        System.out.println("-----------------------------------");
        printRadioStations(array.iterator());
    }

    private static void printRadioStations(Iterator<RadioStation> iterator) {
        // String language, String title, String author, long ISBN, double price
        System.out.printf("%20s | %10s\n", "Name", "Frequency");
        System.out.println("-----------------------------------");
        while (iterator.hasNext()) {
            RadioStation station = iterator.next();
            System.out.printf("%20s | %10s\n",station.getName(), station.getFrequency());
        }
        System.out.println("-----------------------------------");
        System.out.println();
    }
}