package manejoarreglounidimensionales;

import java.util.Scanner;

public class Ejemplo_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vocales = {"a", "e", "i", "o", "u"};
        double[] contador = new double[5];
        String palabra = "";
        boolean bandera = true;
        int seguir;
        String reporteFinal = "";
        while (bandera == true) {
            System.out.println("Ingrese una palabra por favor ");
            palabra = entrada.next();
            char vocal = palabra.charAt(0);
            switch (vocal) {
                case 'A':
                case 'a':
                    contador[0] = contador[0] + 1;
                    break;
                case 'E':
                case 'e':
                    contador[1] = contador[1] + 1;
                    break;
                case 'I':
                case 'i':
                    contador[2] = contador[2] + 1;
                    break;
                case 'O':
                case 'o':
                    contador[3] = contador[3] + 1;
                    break;
                case 'U':
                case 'u':
                    contador[4] = contador[4] + 1;
                    break;
            }
            System.out.println("Desea salir del ciclo, ingrese el número 0");
            seguir = entrada.nextInt();
            if (seguir == 0) {
                bandera = false;
            }
            entrada.nextLine();
        }
        reporteFinal = String.format("%sReporte de notas\n", reporteFinal);
        for (int i = 0; i < contador.length; i++) {
            reporteFinal = String.format("%s Vocal %s, número de veces usada %s\n",
                    reporteFinal, vocales[i], contador[i]);
        }
        System.out.printf("%s\n", reporteFinal);
    }
}
