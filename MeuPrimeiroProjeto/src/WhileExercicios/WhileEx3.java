package WhileExercicios;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		/* 3.	Fa�a um programa que leia e valide as seguintes informa��es:
		Nome: maior que 3 caracteres;
		Idade: entre 0 e 150;
		Sal�rio: maior que zero;
		Sexo: 'f' ou 'm';
		Estado Civil: 's', 'c', 'v', 'd';*/

		Scanner scan = new Scanner(System.in);
		String nome= "";
		String idade= "";
		String salario= "";
		char estadoCivil;
		char genero;
		
		boolean flag = true;
		
		while(flag==true) {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			
			if(nome.chars().count() >3) {
				
				flag = false;
			}else {
				System.out.println("Nome inv�lido");
			}
	    	
	    }
		
		flag = true;
		
		while(flag==true) {
			System.out.println("Digite sua idade: ");
			idade = scan.next();
			
			if(idade.chars().count() <150) {
				
				flag = false;
			}else {
				System.out.println("Idade inv�lida");
			}
	    	
	    }
		
		flag = true;
		
		while(flag==true) {
			System.out.println("Digite seu salario: ");
			idade = scan.next();
			
			if(salario.chars().count() >=0) {
				
				flag = false;
			}else {
				System.out.println("Valor inv�lido");
			}
	    	
	    }
		
		flag = true;
	
		while(flag==true) { 
			
	
		System.out.println("Informe o sexo:");
		
		genero = scan.next().charAt(0)	;
		
		if (genero == 'F' || genero == 'f') {
			System.out.println("Feminino");
			flag = false;
			
		} else if(genero == 'M' || genero == 'm') {
			System.out.println("Masculino");
			flag = false;
			
		}
		
		}
			
		flag = true;
		
		while(flag==true) { 
			
	
		System.out.println("Informe o seu estado civil:");
		
		estadoCivil = scan.next().charAt(0)	;
		
		if (estadoCivil == 'S' || estadoCivil == 's') {
			System.out.println("Solteiro");
			flag = false;
			
		} else if(estadoCivil == 'C' || estadoCivil == 'c') {
			System.out.println("Casado");
			flag = false;
			
		} else if(estadoCivil == 'V' || estadoCivil == 'v') {
			System.out.println("Viuvo");
			flag = false;
			
		} else if(estadoCivil == 'D' || estadoCivil == 'd') {
			System.out.println("Divorciado");
			flag = false;
			
		}
		
		}
		
	}
	
}
		


		

