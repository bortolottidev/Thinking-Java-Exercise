/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privateconstructoruse;
import connectionpackage.ConnectionManager ;

/**
 *
 * @author Daniele
 */
public class PrivateConstructorUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandwidthAvailable = true ;
        while (bandwidthAvailable) {
            if(ConnectionManager.newConnection() == null) 
                bandwidthAvailable = false ;
        }
    }
    
}