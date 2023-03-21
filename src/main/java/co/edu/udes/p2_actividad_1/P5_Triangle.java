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
public class P5_Triangle {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
    
        int base;
        String orientation;
        
        System.out.println("Ingrese el tamaño de la base del triangulo.");
        base = scan.nextInt();
        
        System.out.println("Ingrese la alineacion del triangulo (Izquierda o derecha).");
        orientation = scan.next().toUpperCase();
        
        if(orientation.equals("IZQUIERDA")){
            for (int i = 1; i <= base; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        else if(orientation.equals("DERECHA")){
            for (int i = 1; i <= base; i++){
                
                for (int j = i; j < base; j++){
                    System.out.print(" ");
                }
                
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                
                System.out.println("");
            }
        }
        else{
            System.out.println("Alineacion no reconocida.");
        }
    }
}
