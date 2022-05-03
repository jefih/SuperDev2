package IfElseExercicios;

import java.util.Scanner;

public class IfElseExemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int idade = 0;
		String genero = "";
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("Digite seu genero: ");
		genero = scan.next();
		
		System.out.println("Idade: "+idade);
		System.out.println("Genero: "+genero);
		
		if ((idade>=18) && genero.equalsIgnoreCase("Masculino"))
				{
			System.out.println("Está apto (a) para servir ao exercito");
			
		} else {
			System.out.println("Não está apto(a) para servir ao exercito") ;
		
		}
	}

}
