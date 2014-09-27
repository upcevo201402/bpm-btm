package pe.edu.upc.evolucion.bpm.taskmanager.model.dto;

import java.io.Serializable;

/**
 *
 * @author ianache
 */
public class DocumentoDTO implements Serializable {
    private String nombre;
    private String id;
    private byte[] contenido;

    public DocumentoDTO() {
    }

    public DocumentoDTO(String id,String nombre,  byte[] contenido) {
        this.nombre = nombre;
        this.id = id;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
