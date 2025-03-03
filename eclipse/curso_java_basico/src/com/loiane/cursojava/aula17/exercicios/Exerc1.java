package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
			System.out.println("Entre com a nota");
			
			int nota = scan.nextInt();
			
			if (nota >=0 && nota <=10) {
				System.out.println("Voce Digitou: " +nota);
				notaValida = true;
			} else {
				System.out.println("Nota inválida, digite novamente");
			}
			
		} while (!notaValida);
		
	}

}
