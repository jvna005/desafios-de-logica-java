import java.util.Scanner;

public class Bots {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int botsElite = 0;
		int somaNotas = 0;
		int menorNota = 100;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a nota do Bot " + i + ": ");
			int nota = entrada.nextInt();
			
			somaNotas = somaNotas + nota;

			if (nota >= 80) {
				System.out.println("Bots de elite");
				botsElite++;
			}
			else if  (nota < menorNota) {
				menorNota = nota;
			}
		}
		
		double media = somaNotas / 5.0;
		
		System.out.println("quantos bots tiveram notas acima de 80? " + botsElite);
		System.out.println("qual foi a média? " + media);
		System.out.println("Qual foi a menor nota? " + menorNota);
		
		entrada.close();

	}

}
