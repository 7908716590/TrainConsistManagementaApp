package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase8TrainConsist {

    // ✅ ADD THIS METHOD HERE (outside main)
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 75));

        System.out.println("Original Bogie List:");
        bogies.forEach(System.out::println);

        // ✅ USE the method instead of writing stream again
        List<Bogie> filteredBogies = filterBogies(bogies, 60);

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nOriginal List After Filtering:");
        bogies.forEach(System.out::println);
    }
}