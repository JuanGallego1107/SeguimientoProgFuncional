package EjemploBiFunction;

import java.util.function.BiFunction;

public class BifunctionEjemplo2 {
    public static void main(String[] args) {
        Animal animal = new Animal("Tigre","Bengala");
        ReservaNatural rn= new ReservaNatural("Maniantiales","Medellin",0);
        rn.setNumAnimales(12);
        BiFunction<Animal,ReservaNatural,String> addStatistic = (a, r) -> {

            return "En la reserva natural: "+rn.getNombre()+" se identificaron al menos "+rn.getNumAnimales()+" "+ animal.getAnimal()+" "+animal.getEspecie();
        };
        System.out.println(addStatistic.apply(animal,rn));
    }
}
