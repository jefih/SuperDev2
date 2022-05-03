package IfElse;

import java.util.Scanner;

public class IfElseExemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		System.out.println("Digite a nota 1: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = scan.nextDouble();

		
		System.out.println("Digite a nota 3: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		nota4 = scan.nextDouble();
		
		
		
		double media = (nota1+nota2+nota3+nota4)/4 ;
		//double media = 0;
		//media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Media: "+media);
		
		if (media >= 6) {
			System.out.println("Aluno aprovado");
		
		} else {
	    System.out.println("Aluno reprovado");	
		}
	}

}
