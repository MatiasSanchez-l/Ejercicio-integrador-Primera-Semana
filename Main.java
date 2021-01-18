package ejercicioIntegrador1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //creacion de barcos
        Barco yate1 = new Yate("A1", 15, 2008, 230, 25);
        Barco velero1 = new Velero("B1", 2, 2009, 1);
        Barco velero2 = new Velero("B2", 3, 2004, 2);
        Barco deportivo1 = new Deportivo("C1", 10, 2003, 250);

        //creacion de alquileres
        Alquiler alquiler1 = new Alquiler("A", 123, 8, 16, 1, yate1);
        Alquiler alquiler2 = new Alquiler("B", 321, 3, 23, 2, deportivo1);
        Alquiler alquiler3 = new Alquiler("C", 689, 10, 11, 3, velero1);
        Alquiler alquiler4 = new Alquiler("B", 321, 5, 23, 4, velero2);

        //creacion de listas de alquileres
        //Alquiler alquileresEnero[] = new Alquiler[4];
        List<Alquiler> alquileresEnero = new ArrayList<Alquiler>();

        //clase calculo
        Calculos calculos = new Calculos();

        //llenar lista alquileres
        /*alquileresEnero[0] = alquiler1;
        alquileresEnero[1] = alquiler2;
        alquileresEnero[2] = alquiler3;
        alquileresEnero[3] = alquiler4;*/
        alquileresEnero.add(alquiler1);
        alquileresEnero.add(alquiler2);
        alquileresEnero.add(alquiler3);
        alquileresEnero.add(alquiler4);

        //resultado calculos
        Alquiler mayorAlquiler = calculos.devolverMayorAlquiler(alquileresEnero);
        Alquiler menorAlquiler = calculos.devolverMenorAlquiler(alquileresEnero);
        int promedioAlquileres = calculos.devolverPromedioAlquileres(alquileresEnero);

        System.out.println("En el mes de enero: \nEl mayor alquiler fue: " + mayorAlquiler.toString() + ".\nEl menor alquiler fue: " + menorAlquiler.toString() + ".\nEl promedio fue: " + promedioAlquileres);


    }
}
