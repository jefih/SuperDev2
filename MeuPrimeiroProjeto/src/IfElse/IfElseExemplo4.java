package IfElse;

import java.util.Scanner;

public class IfElseExemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
	    double n2 =0;
		
		System.out.println("Digite um número:");
		n2 = scan.nextDouble();
		
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		
		System.out.println("Número digitado:"+n2);
		System.out.println("Seu nome é:" +nome);
	}

}
