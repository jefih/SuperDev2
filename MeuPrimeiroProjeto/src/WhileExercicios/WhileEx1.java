package WhileExercicios;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0 ;
		double nota = 0 ;
		
		System.out.println("Digite uma nota: ");
		nota = scan.nextDouble();
		
		while (nota<0 || nota>10) {
			System.out.println("Nota inválida, digite novamente: ");
			nota = scan.nextDouble();
			
		
		}

	}

}
