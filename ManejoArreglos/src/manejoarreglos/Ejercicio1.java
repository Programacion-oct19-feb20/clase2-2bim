/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Entrada de valores
        Scanner entrada = new Scanner(System.in);
        
        // Declaramos un arreglo de tipo String
        String [] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";
        
        double [] ventasDias = new double[7];
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("Día (%d) de la semana %s\n",
                    i+1, dias[i]);
            System.out.printf("Venta Día (%d) %s\n",
                    i+1, ventasDias[i]);
        }
    }
    
}
