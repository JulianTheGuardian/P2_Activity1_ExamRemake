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
public class P3_Cans {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int depositedCans;
        int row = 0;
        int stackedCans=0;
        
        System.out.println("Ingrese cuantas latas tiene.");
        depositedCans = scan.nextInt();
        
        while(depositedCans>stackedCans){
            row++;
            stackedCans = stackedCans + row;
        }
        
        if(stackedCans == depositedCans){
            System.out.println("La cantidad de latas ingresadas es aporpiada para apilar.");   
        }
        else{
            if(Math.abs((stackedCans-row)-depositedCans)<(stackedCans-depositedCans)){
                System.out.println("Para poder apilar necesita " + Math.abs((stackedCans-row)-depositedCans) + " latas menos.");
            }
            else{
                System.out.println("Para poder apilar necesita " + (stackedCans-depositedCans) + " latas mas.");
            }
        }
    }
}
