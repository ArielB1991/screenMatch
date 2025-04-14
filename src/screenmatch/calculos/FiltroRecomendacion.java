package screenmatch.calculos;

import com.screenmatch.model.Clasificable;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificacion){
        if(clasificacion.getClasificafle() >= 4){
            System.out.println("Muy bien evaluado");
        } else if (clasificacion.getClasificafle() >= 2){
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
