package WhileExercicios;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		/* 4.	Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de 
		crescimento de 3% e que a popula��o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
		Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A 
		ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.*/

		double populacao = 80000;
		
		System.out.println("Popula��o = "+populacao);
		
		int i = 0;
		while (populacao < 200000) {
		
			i++;
			populacao += populacao*0.03;
			System.out.println("Popula��o = "+populacao);
			
		}
	    System.out.println(i);
	}

}
