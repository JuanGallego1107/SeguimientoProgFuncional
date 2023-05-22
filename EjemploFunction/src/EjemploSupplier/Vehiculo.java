package EjemploSupplier;

public class Vehiculo {
    private String marca;
    private String cilindraje;
    private String color;
    private String tipo;

    public Vehiculo(String marca, String cilindraje, String color, String tipo) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
