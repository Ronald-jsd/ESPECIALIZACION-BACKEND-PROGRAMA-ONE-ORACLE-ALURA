package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    //Audio, para que pueda ser: Cancion o Podcast
    public void adicioneNuevo(Audio audio){
        System.out.println("Adicionando un nuevo audio...");
        if(audio.getClasificacion() >= 8){
            System.out.println("Nombre: " + audio.getTitulo() + " Es uno de los favoritos del momento");
        }else {
            System.out.println("Nombre: " + audio.getTitulo() + " ¡Les gusta a varios!") ;
        }
    }

}
