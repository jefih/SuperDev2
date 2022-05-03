package WhileExercicios;

import java.util.Scanner;

public class WhileEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double notas [] = new double [5];
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite a nota "+(i+1)+": ");
			notas[i] = scan.nextDouble();
				
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
			
		}
		
	}

}
