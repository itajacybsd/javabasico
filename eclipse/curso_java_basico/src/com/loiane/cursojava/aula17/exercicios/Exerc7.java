package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maior = 0;
		for(int i=1; i <= 5; i++) {
			System.out.println("Digito o "+i+"o. número:");
			int numero = scan.nextInt();
			if(numero >= maior) {
				maior = numero;
			}
		}
		System.out.println("O meior número digitado foi o numero: "+maior);
		

	}

}
