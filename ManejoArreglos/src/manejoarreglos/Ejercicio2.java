/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarreglos;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // declaramos arreglo de tipo cadena, para
        // almacenar estudiantes
        
        // String [] estudiantes = new String[4];
        String [] estudiantes = {"José Rivera", "Ana Marquez", "Luis Valverde",
        "Hector Zaruma"};
        double [] notas = {19.2, 10, 13.1, 12.9};
        boolean [] paseCiclo = new boolean [4];
        
        for (int i = 0; i < paseCiclo.length; i++) {
            System.out.printf("%s\n", paseCiclo[i]);
        }
    }
    
}
