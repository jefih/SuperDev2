package While;

import java.util.Scanner;

public class WhileExercicioMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int op=1;
		
		while (op==1){
			System.out.println("Voc� deseja repetir o programa?"+ "1 - Sim 2 - N�o");
			
			op=scan.nextInt();
		}

	}

}
