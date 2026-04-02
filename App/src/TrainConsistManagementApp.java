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
    }
}