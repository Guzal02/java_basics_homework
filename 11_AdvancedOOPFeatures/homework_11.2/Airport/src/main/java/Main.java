import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Flight> planesLeavingInTheNextTwoHours = findPlanesLeavingInTheNextTwoHours(Airport.getInstance());
        planesLeavingInTheNextTwoHours.forEach(System.out::println);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        return airport.getTerminals().stream()
                .map(Terminal::getFlights)
                .flatMap(Collection::stream)
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE)
                .filter(flight -> {
                    LocalDateTime time = getLocalDateTime(flight);
                    LocalDateTime start = LocalDateTime.now();
                    LocalDateTime end = LocalDateTime.now().plusHours(2);
                    return time.isAfter(start) && time.isBefore(end);
                })
                .collect(Collectors.toList());
    }

    private static LocalDateTime getLocalDateTime(Flight flight) {
        return flight.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}