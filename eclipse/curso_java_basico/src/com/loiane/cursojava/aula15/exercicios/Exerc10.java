package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda?(M-Matutino, V-Vespertino, N-Noturno");
		
		String periodo = scan.next();
		
		if(periodo.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		} else if (periodo.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		} else if (periodo.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!") ;
		} else { 
			System.out.println("Valor inválido!");
		}

	}

}
