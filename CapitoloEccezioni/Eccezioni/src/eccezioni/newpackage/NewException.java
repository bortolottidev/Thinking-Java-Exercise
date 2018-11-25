/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccezioni.newpackage;
import java.util.logging.* ;
import java.io.* ;

/**
 *
 * @author Daniele
 */
public class NewException extends Exception {

    private int x = 213;
    
    public NewException() {
        this("NO STRING REPORTED BY YOU A##HOLE") ;
    }

    public NewException(String msg) {
        super(msg);
    }
    
    public NewException(String msg, int val) {
        super(msg) ;
        this.x = val ;
    }
    
    public int val() { return x; }
    
    @Override
    public String getMessage() {
        return "Detail Message: "+ x + " "+ super.getMessage();
    } 
    
    static public void generateLog (Exception e) {
        java.util.logging.Logger l = Logger.getLogger("LoggerName") ;
        StringWriter trace = new StringWriter() ;
//        System.out.println(trace.toString()) ;
        e.printStackTrace(new PrintWriter(trace));
//        System.out.println(trace.toString()) ;
        l.warning(trace.toString()) ;
    }
    
    public static void main (String[] args) {
        try {
            throw new NewException() ;
        } catch (NewException e) {
            e.printStackTrace(System.out) ;
            System.out.println("---------") ;
            generateLog(e) ;
        }
    }
}
