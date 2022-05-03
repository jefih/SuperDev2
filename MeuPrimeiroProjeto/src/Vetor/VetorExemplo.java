package Vetor;

import java.util.Scanner;

public class VetorExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja cadastrar?");
		
		int op = scan.nextInt();
		double notas [] = new double [op];
		double soma=0;
		
		for (int i=0; i< notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+": ");
			notas [1] = scan.nextDouble();
			soma += notas [i];
		}
		
		for (int i=0; i<notas.length; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}

		System.out.println("Media: "+soma/notas.length);
	}

}
