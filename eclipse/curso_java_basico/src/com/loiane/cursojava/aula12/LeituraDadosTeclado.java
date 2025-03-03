package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
	/*	
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("seu nome completo: " +nomeCompleto);

		
		System.out.println("Digite seu primeiro nome : ");
		String primeiroNome = scan.next();
		System.out.println("sue primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade : ");
		int idade = scan.nextInt();
		System.out.println("sua idade e: " + idade);
		
		System.out.println("Digite sua altura : ");
		double altura = scan.nextDouble();
		System.out.println("sua altura e: " + altura);
		*/
		System.out.println("Digite o seu primeiro nome, idade, qtd filhos, altura e se tem animal : ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("voce digitou os seguintes valores: ");
		System.out.println("Nome: " +primeiroNome);
		System.out.println("Idade: " +idade);
		System.out.println("Filhos "+qtdFilhos);
		System.out.println("Altura "+altura);
		System.out.println("tem pet? "+temPet);
		
		
	}

}
