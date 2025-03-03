package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros: ");
		double metro = medida.nextDouble();
		
		double centimetro = metro *100;
		
		System.out.println("valor em centimetros = " + centimetro);
		
	}

}
