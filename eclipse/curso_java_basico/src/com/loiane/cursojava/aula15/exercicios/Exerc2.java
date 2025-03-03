package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor");
		int valor = scan.nextInt();
		
	
		
		
		if (valor > 0) {
			System.out.println("O valor é positivo: "+ valor);
			
		} else {
			System.out.println("O valor é negativo: "+ valor);
		}

	}

}
