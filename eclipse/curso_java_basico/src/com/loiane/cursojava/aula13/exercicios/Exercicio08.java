package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Quanto voce ganha por hora? ");
		double horaValor = valor.nextDouble();
		System.out.println("Quantas horas por mês? ");
		double horasMes = valor.nextDouble();
		double salario = horaValor * horasMes;
		
		System.out.println("Seu salario é de: " + salario);

	}

}
