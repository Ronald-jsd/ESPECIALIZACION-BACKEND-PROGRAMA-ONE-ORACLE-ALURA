package com.aluracursos.screenmatch.models;

public class Serie extends Titulo {
     int temporadas;
     int episodiosPorTemporada;
     int minutosPorEpisodio;


     //set / get
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

        //METODOS ADICIONALES

        //SOBREESCRIBIR METODO DE LA CLASE PADRE
        //Metodo para calcular la cantidad total de series
        @Override //anotacion cuando sobre escribo un metodo
        public int getDuracionEnMinutos() {
            return temporadas * episodiosPorTemporada * minutosPorEpisodio;
            //calculando la duracion en minutos
        }
    }
