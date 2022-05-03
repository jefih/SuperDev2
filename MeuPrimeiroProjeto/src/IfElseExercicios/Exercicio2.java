package IfElseExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2.	Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		
		Scanner scan = new Scanner(System.in);
		
		int n1=0;
		
		System.out.println("Digite o número: ");
		n1 = scan.nextInt();
		
		if (n1 == 0) {
			System.out.println("O número digitado é nulo");
			
		}else if (n1>0) {
			System.out.println("O número é positivo");
		
		}else if (n1<0) {
			System.out.println("O número é negativo");
		
		}
		
		
		
		

		}

	}