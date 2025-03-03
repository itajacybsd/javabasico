package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = numero.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = numero.nextInt();
		
		System.out.println("a soma dos valores é: " + (num1 + num2));

	}

}
