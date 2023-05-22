package EjemploFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Camila", "10854385", 5, 1000000);
        int ValueHE = empleado.getExtraHours()*20000;
        Function<Empleado,String> TotalSalary = ts -> "Empleado/a "+ts.getName()+" y con id "+ts.getId()+"\nSu salario total es "+(ValueHE+ts.getNetSalary());
        System.out.println(TotalSalary.apply(empleado));
    }
}
