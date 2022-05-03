package WhileExercicios;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String senha, usuario;
		
		System.out.println("Digite um usuario: ");
	    usuario = scan.next();
	    
	    System.out.println("Digite uma senha: ");
	    senha = scan.next();
	    
	    while (senha.equals(usuario)) {
	    	System.out.println("Usuario e senha iguais, digite novamente: ");
	    	
	    	System.out.println("Digite um usuario: ");
	    	usuario = scan.next();
	    	
	    	System.out.println("Digite uma senha: ");
	    	senha = scan.next();
	    	
	    }
   
	}

}
