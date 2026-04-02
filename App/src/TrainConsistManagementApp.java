import java.util.ArrayList;
import java.util.List;

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
    }
}