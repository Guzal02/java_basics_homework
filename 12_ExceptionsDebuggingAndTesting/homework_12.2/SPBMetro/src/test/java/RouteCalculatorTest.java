import core.Line;
import core.Station;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RouteCalculatorTest {
    StationIndex stationIndex;
    RouteCalculator routeCalculator;
    List<Station> route;


    @BeforeEach
    protected void setUp() throws Exception {

        stationIndex = new StationIndex();

        Line line1 = new Line(1, "First");
        Line line2 = new Line(2, "Second");
        Line line3 = new Line(3, "Third");

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        Station anikeevka = new Station("Аникеевка", line1);
        Station opalikha = new Station("Опалиха", line1);
        Station krasnogorskaya = new Station("Красногорская", line1);

        line1.addStation(anikeevka);
        line1.addStation(opalikha);
        line1.addStation(krasnogorskaya);

        Station mitino = new Station("Митино", line2);
        Station strogino = new Station("Строгино", line2);
        Station volokolamskaya = new Station("Волоколамская", line2);

        line2.addStation(mitino);
        line2.addStation(strogino);
        line2.addStation(volokolamskaya);

        Station smolenskaya = new Station("Смоленская", line3);
        Station tverskaya = new Station("Тверская", line3);
        Station orekhovo = new Station("Орехово", line3);

        line3.addStation(smolenskaya);
        line3.addStation(tverskaya);
        line3.addStation(orekhovo);

        stationIndex.addStation(anikeevka);
        stationIndex.addStation(opalikha);
        stationIndex.addStation(krasnogorskaya);
        stationIndex.addStation(mitino);
        stationIndex.addStation(strogino);
        stationIndex.addStation(volokolamskaya);
        stationIndex.addStation(smolenskaya);
        stationIndex.addStation(tverskaya);
        stationIndex.addStation(orekhovo);

        List<Station> connection1to2 = new ArrayList<>();
        connection1to2.add(opalikha);
        connection1to2.add(strogino);
        stationIndex.addConnection(connection1to2);

        List<Station> connection2to2 = new ArrayList<>();
        connection2to2.add(volokolamskaya);
        connection2to2.add(tverskaya);
        stationIndex.addConnection(connection2to2);

        routeCalculator = new RouteCalculator(stationIndex);

        route = new ArrayList<>();
        route.add(anikeevka);
        route.add(opalikha);
        route.add(strogino);
        route.add(volokolamskaya);
        route.add(tverskaya);

    }


    @Test
    void testGetShortestRoute() {
        List<Station> actualShortestRoute = routeCalculator.getShortestRoute(stationIndex.getStation("Митино"), stationIndex.getStation("Волоколамская"));
        List<Station> expectedShortestRoute = new ArrayList<>();
        expectedShortestRoute.add(stationIndex.getStation("Митино"));
        expectedShortestRoute.add(stationIndex.getStation("Строгино"));
        expectedShortestRoute.add(stationIndex.getStation("Волоколамская"));
        assertEquals(expectedShortestRoute, actualShortestRoute);
    }


    @Test
    void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 12.0;
        assertEquals(expected, actual);
    }

    @Test
    void getRouteWithOneConnection() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Орехово"), stationIndex.getStation("Митино"));
        List<Station> expected = new ArrayList<>();
        expected.add(stationIndex.getStation("Орехово"));
        expected.add(stationIndex.getStation("Тверская"));
        expected.add(stationIndex.getStation("Волоколамская"));
        expected.add(stationIndex.getStation("Строгино"));
        expected.add(stationIndex.getStation("Митино"));

        assertEquals(expected, actual);
    }

    @Test
    void getRouteWithTwoConnections() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Аникеевка"), stationIndex.getStation("Орехово"));
        List<Station> expected = new ArrayList<>();
        expected.add(stationIndex.getStation("Аникеевка"));
        expected.add(stationIndex.getStation("Опалиха"));
        expected.add(stationIndex.getStation("Строгино"));
        expected.add(stationIndex.getStation("Волоколамская"));
        expected.add(stationIndex.getStation("Тверская"));
        expected.add(stationIndex.getStation("Орехово"));
        assertEquals(expected, actual);
    }

}