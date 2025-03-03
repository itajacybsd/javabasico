package com.loiane.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		int maior, meio, menor = 0;
		
		if (num1 > num2) {
			if (num3 > num2) {
				if (num1 > num3) {
					maior = num1;
					meio = num3;
					menor= num2;
				} else {
					maior = num3;
					meio = num1;
					menor= num2;
				}
			} else {
				maior = num1;
				meio = num2;
				menor= num3;
			}
		} else {
			if (num3 > num1) {
				if (num2 > num3) {
					maior = num2;
					meio = num3;
					menor= num1;
				} else {
					maior = num3;
					meio = num2;
					menor= num1;
				}
			} else {
				maior = num2;
				meio = num1;
				menor= num3;
			}
		}
		
		System.out.println("numeros em ordem do maior para o menor: " + maior +", "+ meio +", "+ menor );
		
		
		
	}

}
