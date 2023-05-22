package EjemploBiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerVet {
    public static void main(String[] args) {
        MascotaCliente mascotaCliente = new MascotaCliente("Pastor aleman","Carlos",8,"NO ATENDIDO");
        AtencionEstado atencionEstado = new AtencionEstado("ATENDIDO");

        System.out.println("Dueño: "+mascotaCliente.getDuenio()+"\nRaza: "+mascotaCliente.getRaza()+"\nEdad: "+mascotaCliente.getEdad()+"\nEstado de atencion: "+mascotaCliente.getEstado());

        BiConsumer<MascotaCliente,AtencionEstado> actualizacionDatos = (masc,aten) -> masc.setEstado(aten.getEstadoAtencion());
        actualizacionDatos.accept(mascotaCliente,atencionEstado);

        System.out.println("==================Datos Actualizados====================");

        System.out.println("Dueño: "+mascotaCliente.getDuenio()+"\nRaza: "+mascotaCliente.getRaza()+"\nEdad: "+mascotaCliente.getEdad()+"\nEstado de atencion: "+mascotaCliente.getEstado());
    }
}
