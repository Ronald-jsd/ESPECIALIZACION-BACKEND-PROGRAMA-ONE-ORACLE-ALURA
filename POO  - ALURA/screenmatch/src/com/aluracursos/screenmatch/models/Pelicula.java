package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {//herencia
    private String director;

    // Métodos getter y setter
    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return director;
    }

    //METODO DE LA INTERFACE CLASIFICACION
    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

}//final class
