/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlloaccesso ;

import accesso.AnotherClass;
import static accesso.AnotherClass.imAMethod ;
/**
 *
 * @author Daniele
 */
public class ControlloAccesso{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnotherClass a = new AnotherClass() ;
        imAMethod();
        // Can't do this
        //AnotherClass.imSoProtected = true ;
        InheritanceClass i = new InheritanceClass() ;
        i.imSoPublic = true ;
        System.out.println("I can see you, you're public: "+i.imSoPublic) ;
        // Not by this class.
        //i.imSoProtected = false ;
    }
    
}

class InheritanceClass extends AnotherClass {
    InheritanceClass () {
        // This class can see the protected attribute,
        // even by another package
        this.imSoProtected = true ;
        System.out.println("Eredito tutto: "+this.imSoProtected) ;
        
    }
}

/*class AnotherClass {
    AnotherClass() {
        System.out.println("lel") ;
    }
}*/
