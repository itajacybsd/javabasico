package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:");
		int base = scan.nextInt();
		System.out.println("Digite o valor do expoente:");
		int expoente = scan.nextInt();
		int resultado=1;
		for(int i = 1; i<= expoente; i++) {
			resultado *= base;
		}
		System.out.println("resultado: "+resultado);

	}

}
