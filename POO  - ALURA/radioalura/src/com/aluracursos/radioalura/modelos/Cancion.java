package com.aluracursos.radioalura.modelos;

public class Cancion extends Audio {
    private String albun;
    private String cantante;
    private String genero;

    //Metodos set/get
    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Sobreescribiendo metodo getClasificacion de la Super Clase Audio
    @Override
    public int getClasificacion() {
        if(getTotalDeMeGusta() > 5000)  {
            return 8;
        }
        else {
            return 4;
        }
    }

}//final class