/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prove;

import java.util.Arrays;

/**
 *
 * @author Daniele
 */
public class Prove {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        InitANullClass seeMe = new InitANullClass("Ciao") ;
        if (seeMe.observed == null)
                System.out.println("è proprio null!");
        seeMe = null ;
        new InitANullClass().observed = "lul" ;
        Tank t1 = new Tank(),
                t2 = new Tank() ;
        t1 = t2 ;
        System.gc() ;
        Integer[] array = new Integer[10];
        array[0] = 1 ;
        System.out.println("Stampo array: "+Arrays.toString(array)) ;
        InitANullClass[] insiemeOggetti = new InitANullClass[10] ;
        Object[] arrayO = new Object[3] ;
        arrayO[0] = new Integer(10) ;
        arrayO[1] = new Tank() ;
        arrayO[2] = new String("Omegalul") ;
        Prove.printArrayObj(arrayO);
        for(String s : args) {
            System.out.println(s);
        }
    }
    
    
    static void printArrayObj (Object... arrayOfObject) {
        for (Object o : arrayOfObject){
            System.out.println("OGGETTO DI ARRAY GENERICO : " + o) ;
        }
        ENumeratoria quantitaCibo[] = ENumeratoria.values() ;
        for (ENumeratoria cibo : quantitaCibo) {
            switch(cibo){
                case POCO :
                    System.out.println("Lamenteleeee!") ;
                    break ;
                case TANTO :
                    System.out.println(cibo.ordinal()+": WOOOW così gentile?") ;
                    break ;
                default :
                    System.out.println("Ma sto array continee propriuo di tutto!") ;
            }
        }
    }
    
}

enum ENumeratoria {
    POCHISSIMO, POCO, OK, TANTO, TROPPISSIMO
}

class InitANullClass {
    String observed = "base";
    
    InitANullClass () {
        System.out.println("Standard costructor");
    }
    
    InitANullClass(String lel) {
        this() ;
        System.out.println("String costructor: "+lel);
    }
    protected void finalize() {
        System.out.println("Finalizzando l'oggetto "+this.observed);
    }
}

// Must be empty when the obj is eliminated by gb
class Tank {
    boolean isEmpty ;
    static InitANullClass lel = new InitANullClass("Io vengo inizializzato qua..") ;
    static {
        System.out.println("Inizializzazione static prioritaria");
        lel = new InitANullClass("Io vengo inizializzato qua!") ;
    }
    {
        System.out.println("Inizializzazione non static non prioritaria :(");
    }
    Tank (){
        this.isEmpty = false ;
    }
    
    
    void readyToDelete() {
        this.isEmpty = true ;
    }
    protected void finalize () {
        if(!this.isEmpty)
            // Errore rilevato e segnalato
            System.out.println("La classe " + this + "eliminata non è vuota!");
    }
}