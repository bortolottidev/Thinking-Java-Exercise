/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prove;
import java.util.*;

/**
 *
 * @author Daniele
 */

class Dog {
    String nome ;
    String verso ;
    Dog() {
        System.out.println("BAUBAUBUAUBAU!") ;
    }
}

class Print{
    void Print(String what, String value) {
        System.out.print(what+": "+value);
    }
}

public class Prove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog[] dogs = new Dog [2];
        for (int i=0; i<2; i++){
            dogs[i] = new Dog() ;
        }
        dogs[0].nome = "Spotty";
        dogs[0].verso = "Grrrrr!";
        dogs[1].nome = "Scruffy" ;
        dogs[1].verso = "Bau!" ;
        for (int i=0; i<2; i++){
            System.out.println(dogs[i].nome + " fa: " + dogs[i].verso);
        }
        
        long longNumber = 0xFFFFFFFFFFFFFFL ;
        int num1 = 0;
        int num2 = 0 ;
        for (int j=0; j<10; j++){
            if (j%2 == 0){
                num1 += 2^j;
                System.out.println("num1: "+num1) ;
            }
            else {
                num2 += 2^j ;
                System.out.println("num2: "+num2) ;
            }
            System.out.println("num1 | num2 = "+ Integer.toBinaryString(num1|num2));
        }
        System.out.println(Long.toBinaryString(longNumber));
        System.out.println("MAX: "+java.lang.Float.MAX_VALUE+" "+
                "MIN: "+java.lang.Float.MIN_VALUE) ;
        int i = 0x10 ;
        System.out.println("i: "+Integer.toBinaryString(i));
        i >>>= 3 ;
        System.out.println("i: "+Integer.toBinaryString(i)) ;
        i = 120;
        char c = 'x';
        // Casting di estensione
        System.out.println((int)c) ;
        //  asting di riduzione!
        System.out.println((char)i) ;
        
        /*
        System.out.print("Numeri primi: ") ;
        int counter = 1;
        for(int num=1; num<=100000; num++) {
            boolean isNumPrime = true ;
            for (int j=2; isNumPrime && (j < num); j++) {
                isNumPrime = (num%j == 0)? false : true ; 
            }
            if(isNumPrime) {
                if (counter%10 != 0)
                    System.out.print(num+" ") ;
                else
                    System.out.println(num+" ");
                counter++;
            }
        }*/
        
        //foreach
        int randInt[] = new int[10] ;
        Random rand = new Random(47) ;
        for (i = 0; i<randInt.length; i++)
            randInt[i] = i;//rand.nextInt()%100 ;
        // utilizzabile su ogni array
        cycleLabel: 
        for(int numeroNelVettore : randInt) {
            if (numeroNelVettore % 2 == 0)
                    continue cycleLabel ;
            else if (numeroNelVettore == 7)
                    break cycleLabel ;
            System.out.print(numeroNelVettore+" ");
        }
        
        //
        
    }
    
    
}
