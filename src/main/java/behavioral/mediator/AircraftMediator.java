package behavioral.mediator;

public interface AircraftMediator {

    void registerRunway(Runway runway);
    String allotRunwayTo(Aircraft aircraft);
    void releaseRunwayOccupiedBy(Aircraft aircraft);
}

