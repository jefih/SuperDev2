package IfElseExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 

		Scanner scan = new Scanner(System.in);
		
		char genero;
		
		System.out.println("Informe a letra:");
		System.out.println("F - Feminino");
		System.out.println("M - Masculino");
		genero = scan.next().charAt(0)	;
		
		if (genero == 'F'|| genero == 'f') {
			System.out.println("Feminino");
			
		} else if(genero == 'M' || genero == 'm') {
			System.out.println("Masculino");
			
		} else {
			System.out.println("Inválido");
		}
		
	}

}
