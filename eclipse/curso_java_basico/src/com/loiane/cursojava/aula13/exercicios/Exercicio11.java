package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);	
		
		System.out.println("Primeiro numero inteiro: ");
		int num1 = numero.nextInt();
		System.out.println("Segundo numero inteiro: ");
		int num2 = numero.nextInt();
		System.out.println("Terceiro numero real: ");
		double num3 = numero.nextDouble();
		
		double primeiro = (num1 *2 + num2/2);
		System.out.println("dobro do primeiro com metade do segundo: " + primeiro);
		double segundo = (num1*3)+num3;
		System.out.println("triplo do primeiro mais terceiro: "+segundo);
		double terceiro = (num3*num3*num3);
		System.out.println("terceiro elevado ao cubo: " +terceiro);
	}

}
