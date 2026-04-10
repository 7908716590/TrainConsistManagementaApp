package test;

import main.Bogie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class UseCase10TrainConsistTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total = getSampleBogies().stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(172, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72)
        );

        int total = list.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(144, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First Class", 40)
        );

        int total = list.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(40, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> empty = new ArrayList<>();

        int total = empty.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = getSampleBogies();

        List<Integer> capacities = list.stream()
                .map(Bogie::getCapacity)
                .toList();

        assertTrue(capacities.contains(72));
        assertTrue(capacities.contains(60));
        assertTrue(capacities.contains(40));
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = getSampleBogies();

        int total = list.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(172, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = getSampleBogies();
        int sizeBefore = list.size();

        list.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(sizeBefore, list.size());
    }
}