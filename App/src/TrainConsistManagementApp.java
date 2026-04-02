import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC5 ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final train formation preserving insertion order
        System.out.println("Train formation (in insertion order, duplicates removed):");
        System.out.println(trainFormation);
    }
}