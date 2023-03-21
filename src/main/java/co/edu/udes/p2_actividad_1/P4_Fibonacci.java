/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.p2_actividad_1;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P4_Fibonacci {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int actualValue = 0;
        int previousValue = 1;
        int posicion;
        
        System.out.println("Ingrese cuantos valores de la serie de fibonacci desea ver.");
        posicion = scan.nextInt();
        
        for (int i = 0; i < posicion; i++) {
            
            System.out.println("El elemento numero " + (i+1) + " de la serie es: " + actualValue);
            
            actualValue = actualValue + previousValue;
            previousValue = actualValue - previousValue;
        }
    }
}
