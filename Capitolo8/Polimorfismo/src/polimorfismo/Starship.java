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

interface canLaugh {
    void play() ;
}

interface canRun {
    void runFools() ;
}

interface fullPowerInterface extends canRun, canLaugh  {
    void omegalul() ;
} 

class What implements fullPowerInterface {

    @Override
    public void omegalul() {
System.out.println("Im so cool") ;    }

    @Override
    public void runFools() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class Real implements canLaugh, canRun {
    
    static {
       System.out.println("DLIN DLONNNN") ; 
    }
    
    @Override
    public void play () {
        System.out.println("DLIN DLONNNN1") ;
    }

    @Override
    public void runFools() {
        System.out.println("RUN, U FOOLS!") ;
    }
}

abstract class Alert {
    Alert() {
        System.out.println("-----------------------------------------") ;
        System.out.print("Actually Alert Level: ") ;
    }
    abstract void play() ;
    
    static void downcastingGreen(Alert a) {
        ((GreenAlert)a).peaceState() ; 
    }
}

class RedAlert extends Alert {
    RedAlert () {
        
    }
    
    @Override
    void play() {
        System.out.println("RED ALARM! RED ALARM!");
    }
}

class GreenAlert extends Alert {
    GreenAlert () {
        
    }
    @Override
    void play() {
        System.out.println("It's all fine boys.") ;
    }
    
    void peaceState() {
        System.out.println("Greeeeeeeeeeeeen weyyy! :D") ;
    }
}

class YellowAlert extends Alert {
    YellowAlert () {
        
    }
    @Override
    void play() {
        System.out.println("Something is going on, be careful! o.O") ;
    }
}

class RandomAlert {
    static Alert nextAlert () {
        java.util.Random Rand = new java.util.Random() ;
        switch(Rand.nextInt(3)) { 
            case 0 :
                return new GreenAlert () ;
            case 1 :
                return new YellowAlert() ;
            default : 
                return new RedAlert() ;
        }
    }
}

public class Starship {

    public static void main(String[] args) {
        Real r = new Real() ;
        r.runFools() ;
        new What().omegalul() ;
        for(int count=0; count<10; count++) {
            Alert alarm = RandomAlert.nextAlert() ;
            alarm.play() ;
            // Downcast.. Ok, ma solo nel caso di greenalert effettivo!
            //((GreenAlert)alarm).peaceState() ;
            if (alarm.getClass().equals(GreenAlert.class))
                Alert.downcastingGreen(alarm) ;
        }
    }
}
