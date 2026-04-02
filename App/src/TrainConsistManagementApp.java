import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppUC6 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC6 ===");

        // Initialize HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Add bogies with their capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 36);

        // Iterate over map and display each bogie and its capacity
        System.out.println("Bogie capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}