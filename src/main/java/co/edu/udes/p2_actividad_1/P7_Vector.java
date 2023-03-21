/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.p2_actividad_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P7_Vector {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int sizeVec1;
        int sizeVec2;
        
        System.out.println("Ingrese el tamaño del vector 1.");
        sizeVec1 = scan.nextInt();
        
        System.out.println("Ingrese el tamaño del vector 2.");
        sizeVec2 = scan.nextInt();
        
        int[] vec1 = new int[sizeVec1];
        int[] vec2 = new int[sizeVec2];
        int[] vec3 = new int[(sizeVec1+sizeVec2)];
        
        for (int i = 0; i < sizeVec1; i++) {
            System.out.println("Ingrese el elemento " + (i+1) + " del vector 1.");
            vec1[i] = scan.nextInt();
        }
        
        for (int i = 0; i < sizeVec2; i++) {
            System.out.println("Ingrese el elemento " + (i+1) + " del vector 2.");
            vec2[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vec3.length; i++) {
            if (i<sizeVec1) {
                vec3[i] = vec1[i];
                System.out.println("pa");
            }
            else{
                System.out.println("pe");
                vec3[i] = vec2[i-vec1.length];
            }
        }
        
        Arrays.sort(vec3);
        
        System.out.println("Vector 3 en orden ascendente.");
        for(int warehouse: vec3){
            System.out.print("[" + warehouse + "] ");
        }
        
        System.out.println("");
        System.out.println("Vector 3 en orden descendiente.");
        
        for (int i = vec3.length-1; i >= 0; i--) {
            System.out.print("[" + vec3[i] + "] ");
        }
    }
}
