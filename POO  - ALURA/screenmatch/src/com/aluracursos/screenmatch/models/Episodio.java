package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numeroEpisodio;
    private String nombre;
    private int totalVisualizaciones;

    //atributo de referencia de serie
    //Nombre clase Serie
    private Serie seriee;



    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSeriee() {
        return seriee;
    }

    public void setSeriee(Serie seriee) {
        this.seriee = seriee;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    //Implementa metodo de INTERFACE CLASIFICACION
    @Override
    public int getClasificacion() {
        if(totalVisualizaciones > 200){
          return 4;
        }else if(totalVisualizaciones > 100) {
            return 2;
        }else return 0;
    }

}
