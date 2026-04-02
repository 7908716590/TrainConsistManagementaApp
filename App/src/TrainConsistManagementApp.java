 feature/UC7-SortCapacity
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistAppUC7 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC7 ===");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 36));

        System.out.println("Before sorting:");
        System.out.println(bogies);

        // Sort bogies by capacity ascending using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("After sorting by capacity (ascending):");
        System.out.println(bogies);

feature/UC6-MapBoogietoCapacity
import java.util.HashMap;
import java.util.Map;
feature/UC5-PreserveInsertionOrder
import java.util.LinkedHashSet;
import java.util.Set;
 main

public class TrainConsistAppUC6 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC6 ===");

        // Initialize HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 36);

 feature/UC6-MapBoogietoCapacity
        // Iterate over map and display each bogie and its capacity
        System.out.println("Bogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final train formation preserving insertion order
        System.out.println("Train formation (in insertion order, duplicates removed):");
        System.out.println(trainFormation);

feature/UC4-MaintainOrder
import java.util.LinkedList;

public class TrainConsistAppUC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC4 ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");

        System.out.println("After adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();

        System.out.println("Removed first bogie: " + removedFirst);
        System.out.println("Removed last bogie: " + removedLast);

        // Display final ordered train consist
        System.out.println("Final ordered train consist:");
        System.out.println(trainConsist);

import java.util.HashSet;
import java.util.Set;

 feature/UC3-TrackUniqueBoggie
public class TrainConsistAppUC3 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC3 ===");

        // Initialize HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique bogie IDs in train consist:");
        System.out.println(bogieIDs);

        System.out.println("Bogie ID uniqueness enforced successfully.");
public class TrainConsistAppUC2 {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App: UC2 ===");

        // Initialize passenger bogies list
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display list after insertion
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Check if Sleeper exists
        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper bogie exist? " + sleeperExists);

        // Display final state of bogies
        System.out.println("Final passenger bogie list:");
        System.out.println(passengerBogies);

        System.out.println("Passenger bogie management complete.");
main
 main
  main
 main
 main
    }
}