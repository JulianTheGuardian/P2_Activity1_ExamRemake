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
public class P2_Date {
    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int day;
        int month;
        int year;
        int totalDays=0;
        boolean leapYear = false;
        boolean correct = false;
        
        System.out.println("Ingrese el dia.");
        day = scan.nextInt();
        System.out.println("Ingrese el numero de mes.");
        month = scan.nextInt();
        System.out.println("Ingrese el año.");
        year = scan.nextInt();
        
        if(year%4 == 0){
           leapYear = true;
        }
        
        switch(month){
            
            case 1:
                
                if(day<=31){
                    correct = true;
                   totalDays = day; 
                }
                break;
                
            case 2:
                
                if(leapYear){
                    
                    if(day<=29){
                        correct = true;
                        totalDays = 31+day; 
                    }
                }
                else{
                    
                    if(day<=28){
                        correct = true;
                        totalDays = 31+day; 
                    }
                }
                break;

            case 3:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+day; 
                }
                break;

                
            case 4:
                
                if(day<=30){
                    correct = true;
                   totalDays = 31+28+31+day; 
                }
                break;

            case 5:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+31+30+day; 
                }
                break;

            case 6:
                
                if(day<=30){
                    correct = true;
                   totalDays = 31+28+31+30+31+day; 
                }
                break;

            case 7:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+day; 
                }
                break;

            case 8:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+31+day; 
                }
                break;

            case 9:
                
                if(day<=30){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+31+31+day; 
                }
                break;

            case 10:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+31+31+30+day; 
                }
                break;

            case 11:
                
                if(day<=30){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+31+31+30+31+day; 
                }
                break;

            case 12:
                
                if(day<=31){
                    correct = true;
                   totalDays = 31+28+31+30+31+30+31+31+30+31+30+day; 
                }
                break;

            default:
                correct = false;
                break;
                
        }
        
        if(leapYear && month>2){
            totalDays++;
        }
        
        if(correct){
            System.out.println("La fecha es valida y han pasado " + totalDays + " dias en ese año.");
        }
        else{
            System.out.println("La fecha es invalida.");
        }
        
    }
}
