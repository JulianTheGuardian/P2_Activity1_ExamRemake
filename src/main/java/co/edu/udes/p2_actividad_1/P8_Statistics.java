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
public class P8_Statistics {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numberOfClasses;
        int hoursPerClass=0;
        int hoursPerMonth=0;
        int maxHours = 0;
        int lessHours = 999999999;
        int rowMaxHours = 0;
        int rowLessHours = 0;
        
        System.out.println("Ingrese cuantas asignaturas cursa.");
        numberOfClasses = scan.nextInt();
        scan.nextLine();
        
        String[][] table = new String[2+numberOfClasses][14];
        
        table[0][0]="Asignatura";
        table[0][1]="Enero";
        table[0][2]="Febrero";
        table[0][3]="Marzo";
        table[0][4]="Abril";
        table[0][5]="Mayo";
        table[0][6]="Junio";
        table[0][7]="Julio";
        table[0][8]="Agosto";
        table[0][9]="Septiembre";
        table[0][10]="Octubre";
        table[0][11]="Noviembre";
        table[0][12]="Diciembre";
        table[0][13]="Total Anual";
        table[1+numberOfClasses][0] = "Total Mensual";
        
        
        for (int i = 1; i <= numberOfClasses; i++) {
            System.out.println("Ingrese el nombre de una asignatura que curse.");
            table[i][0] = scan.nextLine();
        }
        
        for (int i = 1; i <= numberOfClasses; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("Ingrese el nuemro de horas que le dedico a la " + table[i][0] + " durante el mes " + table[0][j] + ".");
                table[i][j] = scan.nextLine();
                hoursPerClass = hoursPerClass + Integer.parseInt(table[i][j]);
            }
            table[i][13] = String.valueOf(hoursPerClass);
            hoursPerClass = 0;
        }
        
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j <= numberOfClasses; j++) {
                hoursPerMonth = hoursPerMonth + Integer.parseInt(table[j][i]);
            }
            table[1+numberOfClasses][i] = String.valueOf(hoursPerMonth);
            hoursPerMonth = 0;
            
        } 
        
        for (int i = 1; i <= numberOfClasses; i++) {
            
            if(Integer.parseInt(table[i][13]) > maxHours){
                maxHours = Integer.parseInt(table[i][13]);
                rowMaxHours = i;
            }
            
            if(Integer.parseInt(table[i][13]) < lessHours){
                lessHours = Integer.parseInt(table[i][13]);
                rowLessHours = i;
            }
        }
        
        for (int i = 0; i < numberOfClasses+2; i++) {
            for (int j = 0; j < 14; j++) {
                System.out.print(" | " + table[i][j] + "\t");
                if(table[i][j].length() < 6){
                    System.out.print("\t");
                }
            }
            System.out.println(" |");
        }
        
        System.out.println("");
        System.out.println("La asignatura con menos horas es: " + table[rowLessHours][0] + " con un total de " + lessHours + ".");
        System.out.println("La asignatura con mas horas es: " + table[rowMaxHours][0] + " con un total de " + maxHours + ".");

    }
}
