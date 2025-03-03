package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner medida = new Scanner(System.in);	
		
		System.out.println("Altura: ");
		double altura = medida.nextDouble();
		
		double pesoIdeal = (72.7 *altura)-58;
		
		System.out.println("Peso Ideal: " + pesoIdeal);

	}

}
