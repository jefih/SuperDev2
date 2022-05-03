import java.util.Scanner;

public class WhileExemploLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int senha=123;
		int usuario=789;
		
		System.out.println("Digite sua senha");
		senha = scan.nextInt();
		
		while (usuario!=789) {
			System.out.println("Usuario Incorreto, digite novamente: ");
			usuario = scan.nextInt();
			
		}
		
		System.out.println("Digite sua ");

	}

}
