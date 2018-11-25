/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccezioni;
import java.util.Random ;

/**
 * Handling the exceptions.
 * @author Daniele
 */

// My special exception!
class InheritException extends Exception {
    InheritException () {}
    InheritException (String msg) { 
        super(msg) ; 
    } 
}

class ErrorClass {
    static void errorMethod () throws InheritException {
        Eccezioni.somethingGoneWrong() ;
    }
}

public class Eccezioni {

    private static int[] ia = new int[2];
    static int x = 5;
    
    static void somethingGoneWrong () throws InheritException {
        throw new InheritException(" HUTSON, CALL THE MEME POLICE, "
                + "WE'VE A PROBLEM") ;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ErrorClass.errorMethod() ;
        } catch (InheritException e) {
            //System.out.println("Don't panic, it's all fine.") ;
            e.printStackTrace(System.out) ;
        }
        try {
            while(true) {
                Random rand = new Random() ;
                if (rand.nextInt(2) == 1) 
                    throw new Exception("There's a new exception in main()") ;
                else
                    System.out.println("Non così fortunato..") ;
            }
        } catch (Exception e) {
            System.out.println("There's no infinite cycle that could contain "
                    + "my POWER!") ;
            e.printStackTrace(System.out) ;
        }
        
        System.out.println("------") ;
        while(true) {
            try {
		ia[x] = 1;
		System.out.println(x);
		break;	
            } catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(
                    "Caught ArrayIndexOutOfBoundsException");
		e.printStackTrace(System.out);
		x-- ;
            } finally {
		System.out.println("Are we done yet?");		
            }
	}
	System.out.println("Now we're done, cause the code reached the break.");
        
    }
}
