package IfElseExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1.	Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		int n1,n2;
	
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior n�mero �: "+n1);
			
		}else {
			System.out.println("O maior n�mero �:"+n2);
		}
		
		
		
		

	}

}
