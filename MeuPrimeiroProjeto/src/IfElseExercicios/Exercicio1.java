package IfElseExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1.	Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		int n1,n2;
	
		
		System.out.println("Digite o primeiro número: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior número é: "+n1);
			
		}else {
			System.out.println("O maior número é:"+n2);
		}
		
		
		
		

	}

}
