/*
 * To change this license header, choose License Headers in Pronum2ect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prove;

/**
 *
 * @author Daniele
 */
public class NumeriVampiro {
    
    public static void main (String[] args) {
        CtrlClass ctrl = new CtrlClass () ; 
        for(int num1=1; num1<100; num1++) {
            ctrl.zanna1 = num1 ;
            for (int num2=1; num2<=num1; num2++) {
                ctrl.zanna2 = num2;
                ctrl.vampire = num1 * num2 ;
                boolean lol = ctrl.ctrlNum();
            }
        }
        
    }
}

class CtrlClass {
    int vampire ;
    int zanna1, zanna2 ;
    
    boolean ctrlNum () {
        int tmp = vampire ;
        String searchIn = Integer.toString(this.zanna1)+
                Integer.toString(this.zanna2) ;
        while(vampire > 0) {
            String wantedNum = Integer.toString(vampire % 10) ;
            vampire /= 10 ;
            String regexp = ".*"+wantedNum+".*" ;
            
            if(!searchIn.matches(regexp))
                return false ;
            searchIn = searchIn.replaceFirst(wantedNum, "_") ;
        }
        String regexp = "_+";
        if(!searchIn.matches(regexp))
            return false ;
        System.out.println("Vampiro: "+tmp+" composto da "+zanna1+" e "+zanna2) ;
        return true;
    }  
}