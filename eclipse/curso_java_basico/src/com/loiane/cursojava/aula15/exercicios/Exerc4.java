package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra: ");
		String letra = scan.next();
		
		
	/*	if (letra.contains("aeiou")) {
			System.out.println("a letra digitada é uma vogal");
		} else {
			System.out.println("a letra digitada é uma consoante");
		}
		*/
		
		if (letra.length() > 1 ) {
			System.out.println("Tem mais de uma letra");
		} else {
			
			switch(letra) {
			case "a": 
			case "e": 
			case "i": 
			case "o": 
			case "u": System.out.println("Vogal"); break;
			case "A": 
			case "E": 
			case "I": 
			case "O": 
			case "U": System.out.println("Vogal"); break;
			default : System.out.println("Consoante");
		}
		
		
		
		}
		
	}

}
