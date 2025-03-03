package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		
		System.out.println("Temperatura em Celsius: ");
		double tempCel = temp.nextDouble();
		
		double farenheit = (tempCel* 9/5) + 32;
		
		System.out.println("Temperatura em Celsius: " + farenheit);

	}

}
