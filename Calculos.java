package ejercicioIntegrador1;

public class Calculos {

    public Alquiler devolverMayorAlquiler(Alquiler listaAlquileres[]){
        Alquiler alquilerMayor = listaAlquileres[0];

        for(int i = 0; i<listaAlquileres.length; i++){
            if(alquilerMayor.devolverCalculoAlquiler() < listaAlquileres[i].devolverCalculoAlquiler()){
                alquilerMayor = listaAlquileres[i];
            }
        }

        return alquilerMayor;
    }

    public Alquiler devolverMenorAlquiler(Alquiler listaAlquileres[]){
        Alquiler alquilerMenor = listaAlquileres[0];

        for(int i = 0; i<listaAlquileres.length; i++){
            if(alquilerMenor.devolverCalculoAlquiler() > listaAlquileres[i].devolverCalculoAlquiler()){
                alquilerMenor = listaAlquileres[i];
            }
        }

        return alquilerMenor;
    }

    public int devolverPromedioAlquileres(Alquiler listaAlquileres[]){
        int sumaAlquileres = 0;
        int nroAlquileres = listaAlquileres.length;

        for(int i = 0; i< nroAlquileres; i++){

            sumaAlquileres += listaAlquileres[i].devolverCalculoAlquiler();
        }

        int promedio = sumaAlquileres / nroAlquileres;

        return promedio;
    }
}
