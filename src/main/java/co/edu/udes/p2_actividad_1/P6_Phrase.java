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
public class P6_Phrase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String phrase;
        int wordsNumber = 0;
        int charactersPerWord = 0;
        
        System.out.println("Ingrese una frase.");
        phrase = scan.nextLine();
        
        for (int i = 0; i < phrase.length(); i++) {
            
            if (phrase.charAt(i) != ' ') {
                charactersPerWord++;
            }
            
            if (phrase.charAt(i) == ' ' || i == (phrase.length()-1)) {
                System.out.println("La primera palabra de la frase tiene: " + charactersPerWord + " caracteres.");
                wordsNumber++;
                charactersPerWord = 0;
            }
        }
        
        System.out.println("La frase tiene: " + wordsNumber + " palabras");
    }
}
