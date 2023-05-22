package EjemploBiFunction;

public class ReservaNatural {
    private String nombre;
    private String ciudad;
    private int numAnimales;

    public ReservaNatural(String nombre, String ciudad, int numAnimales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.numAnimales = numAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumAnimales() {
        return numAnimales;
    }

    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }
}
