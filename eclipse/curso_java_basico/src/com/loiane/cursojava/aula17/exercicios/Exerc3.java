package com.loiane.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		do {
			System.out.println("Digite o nome: ");
			String nome = scan.next();
			if(nome.length() >3) {
				valido = true;
			} else {
				System.out.println("Dado Inválido!  O nome deve possuir mais de 3 letras");
				
			}
			
		} while (!valido);
		valido = false;
		
		do {
			System.out.println("Digite a idade:");
			int idade = scan.nextInt();
			if(idade >= 0 && idade <=150) {
				valido = true;
			}else {
				System.out.println("Dado Inválido! A idade deve ser entre 0 e 150");
				
			}
			
			
		} while (!valido);
		valido = false;
		
		do {
			System.out.println("Digite o salario:");
			double salario = scan.nextDouble();
			if(salario > 0) {
				valido = true;
			}else {
				System.out.println("Dado Inválido! O  Salário deve ser maior que 0(zero)");
				
			}
		} while (!valido);
		valido = false;
		
		do {
			System.out.println("Digite o sexo (F/M)");
			String sexo = scan.next();
			if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") ) {
				valido = true;
			}else {
				System.out.println("Dado Inválido! O sexo deve ser F ou M");
				
			}
		} while (!valido);
		valido = false;
		
		do {
			System.out.println("Digite o Estado Civil(S/C/V/D)");
			String estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")  ) {
				valido = true;
			}else {
				System.out.println("Dado Inválido! O estado civil deve ser c,s,v ou d");
				
			}
		} while (!valido);
		
		
		
		
		
		
		System.out.println("FIM");
		
		
		
	}

}
