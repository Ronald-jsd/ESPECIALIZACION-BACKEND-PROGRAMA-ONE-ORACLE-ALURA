package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacionn){
        if(clasificacionn.getClasificacion() >= 4  ){
            System.out.println("Muy bien evaluado en el momento");
        }else if(clasificacionn.getClasificacion() >= 2){
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }

}//fin class
