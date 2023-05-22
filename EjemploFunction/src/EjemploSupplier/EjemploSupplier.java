package EjemploSupplier;

import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Mazda","1300cc","Gris azulado","Deportivo");
        Supplier<String> vehicle = () -> vehiculo.toString() ;

        Object infoVeh = vehicle.get();

        System.out.println(infoVeh);
    }
}
