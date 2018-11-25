/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio11;
import java.util.*;

/**
 * Only an example of a documented program.
 * @author Bruce Eckel
 * @author Daniele
 * @version 1.0
 */
public class Esercizio11 {

    /**
     * The start point of our program.
     * @param args only an array input
     * @throws exceptions nothing tbh
     */
    public static void main(String[] args) {
        System.out.print("Oggi è il: ");
        System.out.println(new Date()) ;
        // Mi aspetto un 59, in quanto ho inserito il seme 47.
        // In questo modo posso verificare il risultato
        int randomInt = (new Random(47).nextInt(100)) + 1 ;
        System.out.println(randomInt%10);
    }
    
}
