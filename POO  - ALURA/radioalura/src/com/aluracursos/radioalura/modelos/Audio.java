package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;
    private String categoria;

    //Metodos set/get
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Metodos adicionales
    //Conntar cantidad de me gusta
    public void meGusta(){
        this.totalDeMeGusta++;
    }
    //Contar cantidad de reproducciones
    public void reproduce(){
        this.totalDeReproducciones++;
    }
}
