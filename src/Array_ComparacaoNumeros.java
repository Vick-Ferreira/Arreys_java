package src;

import java.util.Locale;
import java.util.Scanner;

public class Array_ComparacaoNumeros {
	// Comparação de valores

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int numero;
		double maiorValor;

		System.out.println("Quantos numeros você quer comparar? ");
		numero = scanner.nextInt();

		double[] numeros = new double[numero];

		for (int i = 0; i < numero; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextDouble();

		}

		maiorValor = numeros[0];
		for (int i = 1; i < numero; i++) {
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
			}
		}
		System.out.printf("Maior valor = %.1f\n", maiorValor);

		scanner.close();

	}

}
