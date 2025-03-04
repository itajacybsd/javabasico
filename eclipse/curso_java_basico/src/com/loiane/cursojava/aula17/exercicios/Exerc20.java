package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean terminou = false;
		boolean valido = false;
		
		int num = 1;
		while(!terminou) {
			while(!valido) {
				System.out.println("Digite o numero fatorial (1-16):");
				num = scan.nextInt();
				if(num <=16 && num >=0) {
					valido = true;
				} else {
					System.out.println("Numero invalido, Digite outro numero (1-16)");
				}
				
				
			}
			
			
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
			
			boolean continua = false;
			while(!continua) {
				
				System.out.println(" ");
				System.out.println("Deseja sair(S/N):");
				String confirma = scan.next();
				if (confirma.equalsIgnoreCase("S") ) {
					continua = true;
					terminou=true;
					
					
				} else if(confirma.equalsIgnoreCase("N")) {
					terminou = false; // SAIR DO PROGRAMA
					continua = true; // CONTINUA A DIGITAR NUMEROS
					valido = false; // DIGITAR O NUMERO ENTRE 1-16, PARA VOLTAR A PERGUNTAR
				} else {
					System.out.println("Opção invalida.  Digite(S/N):");
					continua = false;
				}
			}
		}
		System.out.println("FIM DO PROGRAMA");
		
	}

}
