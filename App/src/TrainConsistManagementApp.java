import java.util.HashSet;
import java.util.Set;

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
    }
}