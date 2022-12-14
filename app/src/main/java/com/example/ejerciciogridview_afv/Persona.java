package com.example.ejerciciogridview_afv;

public class Persona {
    private int imagen;//Imagen de la persona
    private String nombre;//NOmbre de la persona
    private String apellidos;//Apellidos de la persona
    private String ciclo;//Ciclo de la persona

    public Persona() {
    }

    public Persona(int imagen, String nombre, String apellidos, String ciclo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciclo = ciclo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
