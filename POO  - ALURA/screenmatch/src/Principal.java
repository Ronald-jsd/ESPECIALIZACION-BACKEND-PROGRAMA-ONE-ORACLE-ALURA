import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.models.Episodio;
import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;


public class Principal {
    public static void main(String[] args) {
        // Crear una película
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(9);
        miPelicula.evalua(8);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluaciones: " + miPelicula.calculaMedia());

        // Crear una serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("House of the Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(2);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(60);
        casaDragon.muestraFichaTecnica();
        System.out.println("Duración total de la serie: " + casaDragon.getDuracionEnMinutos() + " minutos");

        // Crear otra película
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(136);
        otraPelicula.muestraFichaTecnica();

        // Usar la CalculadoraDeTiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluyeTiempo(miPelicula);
        calculadora.incluyeTiempo(otraPelicula);
        calculadora.incluyeTiempo(casaDragon);

        System.out.println("Tiempo total de películas y series: " + calculadora.getTiempoTotal() + " minutos");

        //PELICULA
        FiltroRecomendaciones filtroRecomendacion = new FiltroRecomendaciones();
        filtroRecomendacion.filtra(miPelicula);

        //EPISODIO
        Episodio episodio = new Episodio();
        episodio.setNumeroEpisodio(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSeriee(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

    }
}
