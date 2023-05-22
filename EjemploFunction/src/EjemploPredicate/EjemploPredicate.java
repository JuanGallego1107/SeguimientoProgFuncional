package EjemploPredicate;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEquals = x -> x == 22;

        boolean plus = isEquals.test(11+5+6);
        System.out.println(plus);

        boolean multplication = isEquals.test(2*10);
        System.out.println(multplication);

        boolean split = isEquals.test(66/3);
        System.out.println(split);
    }
}
