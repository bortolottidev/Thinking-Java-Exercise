package accesso;
import static java.lang.System.out ;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Daniele
 */
public class AnotherClass {
    protected boolean imSoProtected = true ;
    public boolean imSoPublic = false ;
    public AnotherClass(){
        out.println("AnotherClass: Perdincibacco") ;
    }
    
    public static void imAMethod() {
        out.println("So methodic..") ;
    }
}