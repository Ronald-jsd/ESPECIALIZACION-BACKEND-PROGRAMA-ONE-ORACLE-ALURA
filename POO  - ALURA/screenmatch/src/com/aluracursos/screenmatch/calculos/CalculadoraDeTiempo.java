package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.models.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    // Metodo para incluir tanto películas como series (usa el polimorfismo)
    public void incluyeTiempo(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();  // Suma el tiempo de duración
    }

    // Metodo para obtener el tiempo total
    public int getTiempoTotal() {
        return tiempoTotal;
    }
}

/*ESTOS DOS METODOS FUERON REEMPLAZADOR POR EL QUE RECIBE UN OBJETO DE CLASE TITULO
   YA QUE ESTAS DOS CLASES HEREDAN DE ELLA

    public void incluyeTiempo (Pelicula pelicula) {//voy a incluir objeto de clase Pelicula, para usar sus metodos
      //solo recibe parametros de la clase pelicula
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }

    Para incluir Series
    public void incluyeTiempo (Serie serie) {//voy a incluir objeto de clase Pelicula, para usar sus metodos
        //solo recibe parametros  de la clase pelicula
        tiempoTotal += serie.getDuracionEnMinutos();
    }
*/