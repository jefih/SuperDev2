package WhileExercicios;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		/* 4.	Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de 
		crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
		Faça um programa que calcule e escreva o número de anos necessários para que a população do país A 
		ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/

		double populacao = 80000;
		
		System.out.println("População = "+populacao);
		
		int i = 0;
		while (populacao < 200000) {
		
			i++;
			populacao += populacao*0.03;
			System.out.println("População = "+populacao);
			
		}
	    System.out.println(i);
	}

}
