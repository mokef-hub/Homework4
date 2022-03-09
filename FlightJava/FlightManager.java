package FlightJava;

import FlightJava.exception.BadParameterException;
import FlightJava.exception.NullParameterException;
import FlightJava.flight.Flight;

import java.util.Optional;

public interface FlightManager {

    String createFlight(
            String type,
            String airline,
            String origin,
            String destination,
            int capacity
    ) throws BadParameterException, NullParameterException;

    Optional<Flight> getFlightByFlightNumber(String flightNumber);

}
