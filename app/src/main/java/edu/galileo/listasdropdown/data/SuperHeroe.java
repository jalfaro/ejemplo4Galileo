package edu.galileo.listasdropdown.data;

/**
 * Created by jalfaro on 3/5/18.
 */

public class SuperHeroe {
    //POJO Plain Old-fashioned Java Object
    private String nombre;
    private String descripcion;
    private int foto;

    public SuperHeroe() {
        this.nombre = "";
        this.descripcion ="";
        this.foto = 0;
    }

    public SuperHeroe (String nombre, String descripcion, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
