package IfElseExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2.	Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo
		
		Scanner scan = new Scanner(System.in);
		
		int n1=0;
		
		System.out.println("Digite o n�mero: ");
		n1 = scan.nextInt();
		
		if (n1 == 0) {
			System.out.println("O n�mero digitado � nulo");
			
		}else if (n1>0) {
			System.out.println("O n�mero � positivo");
		
		}else if (n1<0) {
			System.out.println("O n�mero � negativo");
		
		}
		
		
		
		

		}

	}