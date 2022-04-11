package behavioral.mediator;

public class MediatorClient {

    public static void main(String[] args) {

        Runway runwayA = new Runway("Runway A");

        AircraftMediator mediator = new AircraftTrafficControlRoom();
        mediator.registerRunway(runwayA);

        AircraftColleague wrightFlight = new Aircraft(mediator, "Wright Flight");
        AircraftColleague airbusA380 = new Aircraft(mediator, "Airbus A380");

        wrightFlight.startLanding();
        airbusA380.startLanding();
        wrightFlight.finishLanding();
    }
}
