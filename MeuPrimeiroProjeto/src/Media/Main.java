package Media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner scan = new Scanner(System.in);
		
		Media media = new Media ();
		
		media.cadastrarNotas();
		
		media.calcularMedia();
		
		media.mostrarMedia();
		
		if (media.media == 10) {
			System.out.println("Aprovado com distinção");
		}else if (media.media>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
	}

}
