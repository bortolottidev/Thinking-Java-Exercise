/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Daniele
 */
public class MetodiAmiciClass {
    public static void main (String[] args) {
        MetodiAmiciClass[] ThinkingIsBaseClass = new MetodiAmiciClass[2] ;
        ThinkingIsBaseClass[0] = new MetodiAmiciClass() ;
        ThinkingIsBaseClass[1] = new AmicoClass() ;
        for (MetodiAmiciClass C : ThinkingIsBaseClass) {
            C.metodo1() ;
        }
    }
    public void metodo1() {
        System.out.println("Sono il metodo1 di base") ;
        metodo2() ;
    }
    public void metodo2() {
        System.out.println("Sono il metodo2 di base") ;
    }
}

class AmicoClass extends MetodiAmiciClass{
    AmicoClass () {
        ;
    }
    
    @Override
    public void metodo2() {
        System.out.println("Sono il metodo2 derivato") ;
    }
}