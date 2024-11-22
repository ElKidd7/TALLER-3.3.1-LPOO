
package taller.pkg3.pkg3.pkg1.lpoo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Itinerario itinerario = new Itinerario("001", "Carlos Sánchez", "Viaje por Europa", new Date(), 10);

        itinerario.agregarDestino("París");
        itinerario.agregarDestino("Berlín");

        itinerario.compartir();
        System.out.println(itinerario.mostrarDetalles());

        itinerario.calificar(5);
        itinerario.calificar(4);
        System.out.println("Promedio de calificaciones: " + itinerario.obtenerPromedioCalificacion());

        itinerario.asignarCategoria("Aventura");
        System.out.println("Categoría: " + itinerario.obtenerCategoria());
    }
}


