package EjemploSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue","red","white","green","black","yellow");

        List<String> colorsSorted = colors.stream()
                .sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(colorsSorted);
    }
}
