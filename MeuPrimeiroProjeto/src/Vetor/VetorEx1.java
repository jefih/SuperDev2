package Vetor;

import java.util.Scanner;

public class VetorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
		
		String nome [] = new String [3];
		
		for (int i = 0; i <nome.length; i++) {
			
			System.out.println("Digite o nome " +(i++));
			nome[i] = scan.next();
				
		}

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Nome "+(i+1)+": "+nome[i]);

	}

}
	
}
