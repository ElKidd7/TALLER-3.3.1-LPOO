
package taller.pkg3.pkg3.pkg1.lpoo;

import java.util.Date;

public abstract class Publicacion {
    protected String idPublicacion;
    protected String autor;
    protected String contenido;
    protected Date fecha;

    public Publicacion(String idPublicacion, String autor, String contenido, Date fecha) {
        this.idPublicacion = idPublicacion;
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public abstract void compartir();
    public abstract String mostrarDetalles();
}
