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
    }
}