package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero fatorial:");
		int num = scan.nextInt();
		int fator= 1;
		for(int i = 1; i <= num; i++ ) {
			fator = fator * i;
		}
		System.out.println("Fatorial de: "+num);
		
		System.out.print(num+"! =");
		for(int i = num; i >= 1; i-- ) {
			System.out.print(" "+i);
			if(i != 1) {
				System.out.print(" .");
			}
		}
		System.out.print(" = "+fator);
		

	}

}
