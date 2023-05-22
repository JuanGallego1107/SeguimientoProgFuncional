package EjemploFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIlter {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(12,32,18,17,22,21,32,16,17);

        List<Integer> mayors = ages.stream()
                .filter(age -> age >= 18)
                .collect(Collectors.toList());

        System.out.println(mayors);
        System.out.println("En el grupo hay "+mayors.size()+" personas mayores de edad.");
    }
}
