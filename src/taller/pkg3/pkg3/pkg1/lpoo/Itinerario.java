
package taller.pkg3.pkg3.pkg1.lpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Itinerario extends Publicacion implements Calificable, Categorizable {
    private int duracionDias;
    private List<String> destinos;
    private List<Integer> calificaciones;
    private String categoria;

    public Itinerario(String idPublicacion, String autor, String contenido, Date fecha, int duracionDias) {
        super(idPublicacion, autor, contenido, fecha);
        this.duracionDias = duracionDias;
        this.destinos = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    public void agregarDestino(String destino) {
        destinos.add(destino);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo itinerario: " + contenido);
    }

    @Override
    public String mostrarDetalles() {
        return "Itinerario: " + contenido + "\nDuración: " + duracionDias + " días\nDestinos: " + destinos;
    }

    @Override
    public void calificar(int puntuacion) {
        if (puntuacion >= 1 && puntuacion <= 5) {
            calificaciones.add(puntuacion);
        } else {
            System.out.println("La calificación debe estar entre 1 y 5.");
        }
    }

    @Override
    public double obtenerPromedioCalificacion() {
        return calificaciones.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public void asignarCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String obtenerCategoria() {
        return categoria;
    }
}
