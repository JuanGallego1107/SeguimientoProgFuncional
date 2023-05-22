package EjemploBiConsumer;

public class MascotaCliente {
    private String raza;
    private String Duenio;
    private int edad;
    private String estado;

    public MascotaCliente(String raza, String duenio, int edad, String estado) {
        this.raza = raza;
        Duenio = duenio;
        this.edad = edad;
        this.estado = estado;
    }

    public String getRaza() {
        return raza;
    }

    public String getDuenio() {
        return Duenio;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
