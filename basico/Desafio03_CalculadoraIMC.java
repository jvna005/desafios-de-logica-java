import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / ( altura * altura);
		
		if (imc < 18.5) {
			System.out.printf("Seu IMC é:  %.2f = abaixo do peso%n", imc);
		}
		else if (imc >= 18.5 && imc <= 24.9) {
			System.out.printf("Seu IMC é:  %.2f = peso normal%n", imc);
		}
		else if (imc >= 25 && imc <= 29.9) {
			System.out.printf("Seu IMC é:  %.2f = sobrepeso%n", imc);
		}
		else if (imc >= 30) {
			System.out.printf("Seu IMC é:  %.2f = obesidade%n", imc);
		}
		
		entrada.close();
		
	}
}
