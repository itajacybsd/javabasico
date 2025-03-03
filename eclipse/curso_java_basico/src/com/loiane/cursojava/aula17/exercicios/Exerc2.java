package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
			System.out.println("entre com o nome do usuario");
			String nomeUsuario = scan.next();
			
			System.out.println("Entre com a senha");
			String senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha invalida, digite novamente");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuario validos");
			}
			
		} while (!infoValidas);

	}

}
