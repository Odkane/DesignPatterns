package behavioral.mediator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AircraftTrafficControlRoom implements AircraftMediator {

    private final LinkedList<Runway> availableRunways = new LinkedList<>();
    private final Map<Aircraft, Runway> aircraftRunwayMap = new HashMap<>();

    @Override
    public void registerRunway(Runway runway) {
        this.availableRunways.add(runway);
    }

    @Override
    public String allotRunwayTo(Aircraft aircraft) {
        Runway nextAvailableRunway = null;
        if(!this.availableRunways.isEmpty()) {
            nextAvailableRunway = this.availableRunways.removeFirst();
            this.aircraftRunwayMap.put(aircraft, nextAvailableRunway);
        }
        return nextAvailableRunway == null ?
                null : nextAvailableRunway.getName();
    }

    @Override
    public void releaseRunwayOccupiedBy(Aircraft aircraft) {
        if(this.aircraftRunwayMap.containsKey(aircraft)) {
            Runway runway = this.aircraftRunwayMap.remove(aircraft);
            this.availableRunways.add(runway);
        }
    }
}