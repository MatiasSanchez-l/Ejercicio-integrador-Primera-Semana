package ejercicioIntegrador1;

import java.util.List;

public class Calculos {

    public Alquiler devolverMayorAlquiler(/*Alquiler listaAlquileres[]*/List<Alquiler> listaAlquileres){
        Alquiler alquilerMayor = listaAlquileres.get(0);

        for(int i = 0; i<listaAlquileres.size(); i++){
            if(alquilerMayor.devolverCalculoAlquiler() < listaAlquileres.get(i).devolverCalculoAlquiler()){
                alquilerMayor = listaAlquileres.get(i);
            }
        }

        return alquilerMayor;
    }

    public Alquiler devolverMenorAlquiler(/*Alquiler listaAlquileres[]*/List<Alquiler> listaAlquileres){
        Alquiler alquilerMenor = listaAlquileres.get(0);

        for(int i = 0; i<listaAlquileres.size(); i++){
            if(alquilerMenor.devolverCalculoAlquiler() > listaAlquileres.get(i).devolverCalculoAlquiler()){
                alquilerMenor = listaAlquileres.get(i);
            }
        }

        return alquilerMenor;
    }

    public int devolverPromedioAlquileres(/*Alquiler listaAlquileres[]*/ List<Alquiler> listaAlquileres){
        int sumaAlquileres = 0;
        int nroAlquileres = listaAlquileres.size();

        for(int i = 0; i< nroAlquileres; i++){

            sumaAlquileres += listaAlquileres.get(i).devolverCalculoAlquiler();
        }

        int promedio = sumaAlquileres / nroAlquileres;

        return promedio;
    }
}
