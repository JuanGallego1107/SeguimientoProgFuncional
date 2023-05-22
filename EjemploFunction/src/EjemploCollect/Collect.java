package EjemploCollect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {
    public static void main(String[] args) {
        Stream<String> vehicles = Stream.of("Car", "Motorcycle", "Boat", "Bycicle", "Bus");

        List<String> furniture_list = vehicles.collect(Collectors.toList());

        for (String furniture : furniture_list) {
            System.out.println(furniture);
        }
    }
}
