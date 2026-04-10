package test;

import main.Bogie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistTest {

    private List<Bogie> getSampleBogies() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );
    }

    @Test
    void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> grouped =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertTrue(grouped.containsKey("Sleeper"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> grouped =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> grouped =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(3, grouped.keySet().size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> emptyList = new ArrayList<>();

        Map<String, List<Bogie>> grouped =
                emptyList.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertTrue(grouped.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72)
        );

        Map<String, List<Bogie>> grouped =
                list.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(1, grouped.size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> grouped =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertTrue(grouped.containsKey("AC Chair"));
        assertTrue(grouped.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> grouped =
                getSampleBogies().stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(2, grouped.get("Sleeper").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        int sizeBefore = original.size();

        original.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(sizeBefore, original.size());
    }
}