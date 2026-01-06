import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		int contNormal = 0;
		int contPrioritario = 0;
		int somaCodigos = 0;
		
	
		for (int i = 1; i <= 6; i++) {
			System.out.println("Digite o codigo da solicitação " + i + ": ");
			int codigo = entrada.nextInt();

			somaCodigos = somaCodigos + codigo;
			
			if (codigo == 1) {
				System.out.println("Atendimento normal");
			contNormal++;
			}
			
			else if (codigo == 2) {
				System.out.println("prioritário");
				contPrioritario++;
			}
			else
				System.out.println("Erro de Sistema");
		}

		int media = somaCodigos / 6;
		
		System.out.println("Quantos atedimentos normais?: " + contNormal);
		System.out.println("Quantos atedimentos prioritario?: " + contPrioritario);
		System.out.println("media dos codigos: " + media);


		entrada.close();

	}

}
