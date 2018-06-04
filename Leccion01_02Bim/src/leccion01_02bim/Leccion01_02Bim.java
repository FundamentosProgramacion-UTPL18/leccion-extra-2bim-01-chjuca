/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion01_02bim;

/**
 *
 * @author Carlos Juca
 */
public class Leccion01_02Bim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double prom;                                                            // Declaracion de la variable que almacenaraa el promedio
        double suma = 0;                                                        // Declaracion de la variable que almacenar la suma del Arreglo 3
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};                        // Declaacion e Inicializacion de los Arreglos
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];                                      // Declaracion del Arreglo que almacenara el promedio de los Arreglos en la posicion n

        for (int i = 0; i < arreglo3.length; i++) {                             // Inicia el for que recorrera el Arreglo
            arreglo3[i] = (arreglo1[i] + arreglo2[i]) / 2;                      // Calcular el promedio de los arreglos y almacenarlo en el arreglo3
            suma = suma + arreglo3[i];                                          // Suma los valores almacenados en arreglo3
        }
        System.out.printf("%s\t%s\t%s\t\n", "Areglo1", "Arreglo2", "Resultado");                // Presenta los encabezados
        for (int i = 0; i < arreglo3.length; i++) {                                             // Inicia el for que recorrera el Arreglo
            System.out.printf("%d\t%d\t\t%.2f\n", arreglo1[i], arreglo2[i], arreglo3[i]);       // Prsenta los valores que se suman y el arreglo con el promedio
        }
        prom = suma / 6;                                                                        // Se suma los valores en el arreglo y se almacena en la variable prom
        System.out.printf("\nEl promedio del Arreglo 3 es: %.2f\n", prom);                        // Se presenta el promedio
    }

}
