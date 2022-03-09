package FlightJava;

import FlightJava.exception.BadParameterException;
import FlightJava.exception.NullParameterException;
import FlightJava.flight.Flight;

import java.util.Optional;

public class FlightManagerProxy implements FlightManager {
    private FlightManagerImpl flightManager;

    private FlightManager getFlightManager() {
        if (flightManager == null) {
            flightManager = FlightManagerImpl.getInstance();
        }

        return flightManager;
    }

    @Override
    public String createFlight(String type, String airline, String origin, String destination, int capacity) throws BadParameterException, NullParameterException {
        System.out.println("A flight is being created");
        return getFlightManager().createFlight(type, airline, origin, destination, capacity);
    }

    @Override
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        System.out.println("Flight number: " + flightNumber + " is being retrieved.");
        return getFlightManager().getFlightByFlightNumber(flightNumber);
    }
}
