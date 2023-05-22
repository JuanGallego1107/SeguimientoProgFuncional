package EjemploConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ConsumerRace {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Ducati");
        teams.add("Yamaha");
        teams.add("Honda");

        AtomicInteger n = new AtomicInteger();

        Consumer<String> consumer = positions -> System.out.println("The position for " + positions + " is "+(n.getAndIncrement()+1));
        teams.forEach(consumer);
    }
}
