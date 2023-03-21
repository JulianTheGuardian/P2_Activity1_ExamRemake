/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udes.p2_actividad_1;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class P1_Time {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int sec;
        int min;
        int hour24;
        int hour12;
        int days;
        String format;
        
        System.out.println("Ingrese el numero de segundos que desea convertir.");
        sec = scan.nextInt();
        
        min = sec/60;
        sec = sec%60;
        
        hour24 = min/60;
        min = min%60;
        
        days = hour24/24;
        hour24 = hour24%24;
        hour12 = hour24;
        
        if(hour12>12){
            hour12 = hour12-12;
            format = "PM ";
        }
        else{
            format = "AM ";
        }
        
        System.out.println("El tiempo ingresado corresponde a: " + days + " dias con " + hour24 + " horas " + min + " minutos y " + sec + " segundos.");
        System.out.println("O");
        System.out.println("El tiempo ingresado corresponde a: " + days + " dias con " + hour12 + " horas " + format + min + " minutos y " + sec + " segundos.");
    }
}
