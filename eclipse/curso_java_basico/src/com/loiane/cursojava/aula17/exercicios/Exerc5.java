package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			boolean sair =false;
			while(!sair) {
				
				
				
				double popA = 0;
				double popB = 0;
				double taxA = 0;
				double taxB = 0;
				
				boolean valido =false;
				while (!valido) {
					System.out.println("Entre com numero de Habitantes do país A: ");
					popA = scan.nextDouble();
					if(popA > 0) {
						valido = true;
					} else {
						System.out.println("Valor invalido! Entre com o número de Habitantes do país A");
					}
				}
				
				valido =false;
				
				while (!valido) {
					System.out.println("Taxa de crescimento da população A ");
					taxA = scan.nextDouble();
					if(taxA > 0) {
						valido = true;
					} else {
						System.out.println("Valor invalido! Entre com a Taxa de crescimento da população A ");
					}
				}
				
				
				
				
				valido =false;
				while (!valido) {
					System.out.println("Entre com numero de Habitantes do país B: ");
					popB = scan.nextDouble();
					if(popB > 0) {
						valido = true;
					} else {
						System.out.println("Valor invalido! Entre com a Taxa de Crescimento do país A");
					}
				}
				
				valido =false;
				while (!valido) {
					System.out.println("Taxa de crescimento da população B ");
					taxB = scan.nextDouble();
					if(taxB > 0) {
						valido = true;
					} else {
						System.out.println("Valor invalido! Entre com a Taxa de crescimento da população B ");
					}
				}
				
				
				
				
				int ano = 0;
				while (popA < popB) {
					
					
					popA = popA * (1 + (taxA /100));
					popB = popB * (1 + (taxB/100));
					
					
					ano++;
					System.out.println("Ano: "+ano+"; Habitantes do País A = "+popA+" Habitantes do País B = "+popB);
					
					
				}
				
				System.out.println("Levaram "+ano+ ", para os Habitantes do País A, superarem os habitantes do país B");
				
				System.out.println("Deseja sair(S/N)?");
				String saida = scan.next();
				if(saida.equalsIgnoreCase("S")) {
					System.out.println("Programa encerrado");
					sair = true;
				}
			}
	}

}
