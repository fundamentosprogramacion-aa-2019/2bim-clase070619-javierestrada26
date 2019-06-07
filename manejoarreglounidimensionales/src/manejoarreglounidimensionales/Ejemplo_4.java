package manejoarreglounidimensionales;

import java.util.Scanner;

public class Ejemplo_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        String[] categorias = {"Comedia", "Terror", "Drama", "Familiar"};
        int[] t_peliculas = new int[4];
        int peli = 0;
        boolean bandera = true;
        int seguir;
        String reporteFinal = "";
        //empieza el ciclo
        while (bandera == true) {
            System.out.println("Ingrese la categoría de pelicula"
                    + " de su preferencia");
            System.out.println(" Comedia---> 1 ");
            System.out.println(" Terror-----> 2");
            System.out.println(" Drama---->3 ");
            System.out.println(" Familiar----4 ");
            peli = entrada.nextInt();
            if (peli == 1) {
                t_peliculas[0] = t_peliculas[0] + 1;
            } else {
                if (peli == 2) {
                    t_peliculas[1] = t_peliculas[1] + 1;
                } else {
                    if (peli == 3) {
                        t_peliculas[2] = t_peliculas[2] + 1;
                    } else {
                        if (peli == 4) {
                            t_peliculas[3] = t_peliculas[3] + 1;
                        }
                    }
                }
            }
            //pregunta si quiere seguir
            System.out.println("Desea salir del ciclo, ingrese el número 0");
            seguir = entrada.nextInt();
            if (seguir == 0) {
                bandera = false;
            }
        }
        reporteFinal = String.format("%s----------Reporte de preferencias de"
                + " películas-----------\n", reporteFinal);
        //cambio de numero a asterisco
        for (int i = 0; i < t_peliculas.length; i++) {
            int j = t_peliculas[i];
            String cambio = "";
            for (int g = 0; g < j; g++) {
                cambio = String.format("%s*", cambio);

            }
            reporteFinal = String.format("%s %s %s \n ",
                    reporteFinal, categorias[i], cambio);
        }

        System.out.printf("%s\n", reporteFinal);

    }
}
