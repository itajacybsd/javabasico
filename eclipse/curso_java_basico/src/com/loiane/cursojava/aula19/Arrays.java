package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		
		// o indice no array começa no 0 (zero)
		
		double[] temperaturas = new double[365] ;
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 32.7;
		temperaturas[3] = 34;
		temperaturas[4] = 35;
		
		System.out.println("O valor da temperaturatura do dia 1 e: "+temperaturas[0]);
		
		System.out.println("tamanho do array: "+temperaturas.length);
		
		System.out.println("valores do array "+temperaturas);
		/*
		for (int i=0; i<temperaturas.length;i++) {
			System.out.println("O valor da temperaturatura do dia "+(i+1)+" e: "+temperaturas[i]);
			
		}
*/
		
		// FOR melhorado
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}

}
