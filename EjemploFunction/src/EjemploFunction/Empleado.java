package EjemploFunction;

public class Empleado {
    private String name;
    private String id;
    private int extraHours;
    private int NetSalary;

    public Empleado(String name, String id, int extraHours, int NetSalary) {
        this.name = name;
        this.id = id;
        this.extraHours = extraHours;
        this.NetSalary = NetSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public int getNetSalary() {
        return NetSalary;
    }
}
