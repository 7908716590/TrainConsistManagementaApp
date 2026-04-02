import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args)
    {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty list of bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues
        System.out.println("Train consist initialized successfully.");
    }
}
