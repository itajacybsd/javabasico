package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Temperatura em Farenheit: ");
		double tempFar = temp.nextDouble();
		
		double celsius = (5 * (tempFar-32)/9);
		
		System.out.println("Temperatura em Celsius: " + celsius);

	}

}
