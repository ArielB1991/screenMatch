import com.screenmatch.model.Episodio;
import com.screenmatch.model.Pelicula;
import com.screenmatch.model.Serie;
import screenmatch.calculos.CalculadoraDeTiempo;
import screenmatch.calculos.FiltroRecomendacion;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidaEnPlan(true);


        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(7);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calcularMedia());


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidaEnPlan(true);

            otraPelicula.muestraFichaTecnica();
            otraPelicula.evalua(9);
            otraPelicula.evalua(8);


        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setTemporadas(1);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        System.out.println("+++++"+ calculadora.getTiempoTotal());
        calculadora.incluye(casaDragon);
        System.out.println("+++++"+ calculadora.getTiempoTotal());
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "+calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragon);
        episodio.setVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);
    }
}
