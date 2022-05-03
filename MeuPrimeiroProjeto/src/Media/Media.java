package Media;

import java.util.Scanner;

public class Media {

	Scanner scan = new Scanner(System.in);
    
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	public double media;
	
	
	public void cadastrarNotas() {
		System.out.println("Digite a nota 1: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = scan.nextDouble();
		System.out.println("Digite a nota 4: ");
		nota4 = scan.nextDouble();
	
			
		}
          public void calcularMedia () {
		      media = (nota1+nota2+nota3+nota4/4);
	}

		
		public void mostrarMedia () {
			System.out.println("Total: ");
		}


}
