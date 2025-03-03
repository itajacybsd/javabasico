package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);

		System.out.println("nota do 1 bimestre:");
		int bim1 = nota.nextInt();
		System.out.println("nota do 2 bimestre:");
		int bim2 = nota.nextInt();
		System.out.println("nota do 3 bimestre:");
		int bim3 = nota.nextInt();
		System.out.println("nota do 4 bimestre:");
		int bim4 = nota.nextInt();
		
		double resultado = (bim1 + bim2 + bim3 + bim4) /4; 
		System.out.println("A media das notas é: " + resultado);
		
		
	}

}
