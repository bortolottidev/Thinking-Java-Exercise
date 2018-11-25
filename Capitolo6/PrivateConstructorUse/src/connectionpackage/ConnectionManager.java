/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionpackage;

/**
 *
 * @author Daniele
 */

public class ConnectionManager extends Connection {
    // 5 connection available
    static private Connection[] connAvailable = new Connection[5] ;
    static {
        for(int i=0; i<5; i++)
            connAvailable[i] = null ;
    }
    
    public ConnectionManager () {
        ;
    }
    static public Connection newConnection () {
        for(int i=0; i<5; i++)
            if(connAvailable[i] == null) {
                connAvailable[i] = new Connection() ;
                return connAvailable[i] ;
            }
        return null ;
    }
}
