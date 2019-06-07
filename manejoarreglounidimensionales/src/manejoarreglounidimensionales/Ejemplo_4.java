package manejoarreglounidimensionales;

import java.util.Scanner;

public class Ejemplo_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] categorias = {"Comedia", "Terror", "Drama", "Familiar"};
        double[] t_peliculas = new double[4];
        int peli = 0;
        boolean bandera = true;
        int seguir;
        String reporteFinal = "";
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
            System.out.println("Desea salir del ciclo, ingrese el número 0");
            seguir = entrada.nextInt();
            if (seguir == 0) {
                bandera = false;
            }
        }
        reporteFinal = String.format("%sReporte de preferencias de películas\n", reporteFinal);
        for (int i = 0; i < t_peliculas.length; i++) {
            reporteFinal = String.format("%s %s : %s\n",
                    reporteFinal, categorias[i], t_peliculas[i]);
        }
        System.out.printf("%s\n", reporteFinal);
    }
}
