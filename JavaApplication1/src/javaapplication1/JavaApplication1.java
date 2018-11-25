/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.net.*;

/**
 * TCP CLIENT
 * @author Daniele
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String messaggio;
        String messaggioModificato;
        
        BufferedReader inFromUser = new BufferedReader(
            new InputStreamReader(System.in)) ;
        
        String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
            "running the date service on port 9090:");
        Socket s = new Socket(serverAddress, 9090);
        
        DataOutputStream outToServer = new DataOutputStream(
            clientSocket.getOutputStream()) ;
        
        BufferedReader inFromServer = new BufferedReader(
            new InputStreamReader(clientSocket.getInputStream())) ;
        
        messaggio = inFromUser.readLine();
        outToServer.writeBytes(messaggio+"\n");
        messaggioModificato = inFromServer.readLine();
        System.out.println("FROM SERVER: " + messaggioModificato);
        
        clientSocket.close();
    }
    
}
