/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riutilizzoclassi;

/**
 *
 * @author Daniele
 */
public class RiutilizzoClassi {

    private String onlyAString ;
    
    RiutilizzoClassi () {
        System.out.println("Costruttore predefinito.") ;
        this.onlyAString = "omegalul" ;
    }
    
    RiutilizzoClassi (String string) {
        System.out.println("Advanced constructor") ;
        this.onlyAString = string ; 
    }
    
    public String toString () {
        return this.onlyAString ;
    }
    
    protected void method() {
        System.out.println("RiutilizzoClassi method") ;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RiutilizzoClassi ClasseComposta = new RiutilizzoClassi() ;
        //System.out.println(ClasseComposta) ;
        System.out.println(new CompositionClass("Stringa")) ;
    }
    
}

class CompositionClass extends RiutilizzoClassi {
    private String str ;

    // Costruttore generato in automatico per chiamare superlcassi
    // L'affermazione qua sopra non è valida se creo un altro costruttore.
    CompositionClass() {
        ;
    }
    
    // Constructor with string
    CompositionClass(String string) {
        super(string) ;
    }
    
    protected void method () {
        System.out.println("CompositionClass method") ;
    }
    
    public String toString() {
        method() ;
        super.method() ;
        return super.toString() ;
    }
}
