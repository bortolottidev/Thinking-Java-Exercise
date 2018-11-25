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
public class Esercizio5 {
    public static void main(String[] args) {
	C c = new C(); // will construct an A first
    }
}

class A { A(){ System.out.println("A()");} }

class B extends A { B(){ System.out.println("B()");} }

class C extends A { 
	B b = new B(); // will then construct another A and then a B
}
