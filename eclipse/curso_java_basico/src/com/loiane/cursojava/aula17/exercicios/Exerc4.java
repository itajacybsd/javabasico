package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double popA = 80000;
		
		double popB = 200000;
		
		int ano = 0;
		while (popA <= popB) {
			
			
			popA = popA * 1.030;
			
			popB = popB * 1.015;
			
			ano++;
			System.out.println("Ano: "+ano+"; Habitantes do País A = "+popA+" Habitantes do País B = "+popB);
			
			
		}
		
		System.out.println("Levaram "+ano+ ", para os Habitantes do País A, superarem os habitantes do país B");
		
		

	}

}
