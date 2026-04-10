package test;

import main.Bogie;
import main.UseCase8TrainConsist;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 50)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertEquals(1, result.size());
        assertTrue(result.get(0).getCapacity() > 70);
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertTrue(result.isEmpty()); // 70 should NOT be included
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 40),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 75),
                new Bogie("First Class", 40)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 30),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 90)
        );

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = UseCase8TrainConsist.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 80));

        UseCase8TrainConsist.filterBogies(bogies, 70);

        assertEquals(1, bogies.size()); // original list unchanged
    }
}