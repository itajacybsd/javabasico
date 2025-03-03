package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		double raio = scan.nextDouble();
		double area = 3.1415 * (raio * raio);
		System.out.println("Area do circulo é: " + area);

	}

}
