import java.util.Scanner;

public class TemperaturaArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantos dias quer registrar?");
		int dias = entrada.nextInt();
		
		System.out.println("Quantos horários por dia?");
		int horas = entrada.nextInt();
		
		double total = 0;
		double [][] temperatura = new double [dias] [horas];
		
		for (int d = 0; d < temperatura.length; d++) {
			for (int h = 0; h < temperatura[d].length; h++) {
			
				System.out.printf("informe a temperatura do dia %d e do primeiro horário %d: ", d + 1, h+ 1);
				
				temperatura[d][h] = entrada.nextDouble();
				total += temperatura [d][h];	
		}	
		}
		
		double media = total / (dias * horas);
		System.out.println("A Média geral da temperatura nesses dias foram: " + media + "°C");
		
		entrada.close();
		
	}
}
