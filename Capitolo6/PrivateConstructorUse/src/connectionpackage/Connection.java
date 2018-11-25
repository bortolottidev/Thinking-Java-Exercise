/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionpackage;
import java.util.Random ;
/**
 *  Actually, there's no way to initialize this object, i've to use the ConnectionManager
 * for do it!
 * @author Daniele
 */
public class Connection {
    private Random randomConn = new Random() ;
    protected Connection () {
        System.out.println("Hi, i'm the connection no. "+randomConn.nextInt(1000)) ;
    }
}
