package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
	
		double[][] notaAlunos = new double[3][4];
		
		notaAlunos[0][0] = 10;
		notaAlunos[0][1] = 7;
		notaAlunos[0][2] = 9;
		notaAlunos[0][3] = 9.5;
		
		
		notaAlunos[1][0] = 9;
		notaAlunos[1][1] = 8;
		notaAlunos[1][2] = 7;
		notaAlunos[1][3] = 9;
		
		
		notaAlunos[2][0] = 8;
		notaAlunos[2][1] = 9;
		notaAlunos[2][2] = 10;
		notaAlunos[2][3] = 7;
		
		notaAlunos[1][3] = 8;
		
		// imprimindo matriz
		
		System.out.println(notaAlunos.length);
		System.out.println(notaAlunos[0].length);
//		
		for(int i=0; i< notaAlunos.length; i++) {
//			System.out.println("Aluno.: "+notaAlunos[i]);
			for( int j=0; j< notaAlunos[i].length; j++) {
				System.out.print(notaAlunos[i][j]+ " - ");
			}
		}
		
		System.out.println("Calculando a media de cada aluno");
		
		double soma;
		for(int i=0; i< notaAlunos.length; i++) {
			soma=0;
			for( int j=0; j< notaAlunos[i].length; j++) {
				soma += notaAlunos[i][j];
			}
			System.out.println("A media do aluno "+i+" é = "+(soma/4));
		}
		

	}

}
