/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 * The polymorphism is Queen-Approved.
 * @author Daniele
 */
public class Polimorfismo {

    public Polimorfismo() {
        ;
    }   
    
    void overridedMethod () {
        System.out.println("Comportamento di base") ;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polimorfismo [] p = new Polimorfismo[10] ;
        for (Polimorfismo polio : p) 
            System.out.println(polio);
        System.out.println("- - - - - -") ;
        p[0] = (Polimorfismo)(new Subclass1()) ;
        //p[0] = null ;
        p[1] = new Subclass2() ;
        p[2] = new Subclass3() ;
        p[3] = new Polimorfismo() ;
        p[4] = new Subclass1() ;
        System.out.println("- - - - - -") ;
        try {
            for (Polimorfismo polio : p) {
                if (polio.equals(null)) {
                    //System.out.println("QUA ESPLODE TUTTO!") ;
                    new Exception("No polio pointer, noob") ;
                }
                polio.overridedMethod() ;
            }
        } catch (Exception e) {
            System.out.print("Hutson.. ") ;
            ((Throwable)e).printStackTrace(System.out); ;
        }
    }
}

class Subclass1 extends Polimorfismo {
    Subclass1() {
        System.out.println("Don't stop me now!") ;
    }
}

class Subclass2 extends Polimorfismo {
    Subclass2() {
        System.out.println("I'm having such a good time") ;
    }
}

class Subclass3 extends Polimorfismo {
    Subclass3() {
        System.out.println("I'm having a ball") ;
    }
    @Override void overridedMethod () {
        System.out.println("So over, so rided.") ;
    }
}


