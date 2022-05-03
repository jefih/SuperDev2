package For;

import java.util.Scanner;

public class ForExemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n1=0,n2=0;
		System.out.println("Digite um número: ");
		n1=scan.nextInt();
		
		System.out.println("Digite um número: ");
		n2=scan.nextInt();
		
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
	}

}
