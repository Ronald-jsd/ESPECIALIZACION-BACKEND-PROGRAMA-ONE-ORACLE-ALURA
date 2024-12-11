import com.aluracursos.radioalura.modelos.Audio;
import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        //objeto Cancion
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Something");
        miCancion.setCantante("The beatles");

        //objeto Podcast
        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Rodrigo");
        miPodcast.setTitulo("Disciplina y exito");

        //Usando for para simular la cantidad de veces de uso (miCancion)
        for(int i = 0; i < 100; i++ ){
            miCancion.meGusta();
        }
        for(int i = 0; i < 2000; i++ ){
            miCancion.reproduce();
        }

        //Usando for para simular la cantidad de veces de uso (miPodcast)
        for(int i =0; i < 100;i++){
            miPodcast.meGusta();
        }

        for(int i = 0; i < 8000; i++ ){
            miPodcast.reproduce();
        }

        //Imprimiento el  total de miCancion
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());
        System.out.println("*------------------------------------------------------*");
        //Imprimiento el  total de miPodcast
        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miPodcast.getTotalDeMeGusta());
        System.out.println("*------------------------------------------------------*");

        //Clasificacion
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicioneNuevo(miCancion);
        System.out.println("*------------------------------------------------------*");
        favoritos.adicioneNuevo(miPodcast);

    }//final main
}//final class
