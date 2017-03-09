package org.foobarspam.Estructuras;

import java.util.Stack;

public class CadenaAlRevesPila {
	
	public static void main (String[] args) {
		String cadena = "Buenos dias a todos";
		Stack<Character> pila = new Stack<Character>();
		System.out.println("Input: " + cadena);
		
		for (Character letra : cadena.toCharArray()){
			pila.push(letra);
		}
		System.out.print("Al revés: ");
		while(!pila.isEmpty()){
			System.out.print(pila.pop());
		}

	}
}