package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado de um quadrado:");
		
		int ladoQuad = valor.nextInt();
		
		int quadrado = ladoQuad * ladoQuad;
		
		int dobro = quadrado * quadrado;
		
		System.out.println("Area do quadrado:" + quadrado);
		
		System.out.println("Dobro da area do quadrado:" + dobro);
		

	}

}
