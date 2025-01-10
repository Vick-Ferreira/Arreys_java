package src;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Array_ParesEImpares {
	// Descobrir numeros pares, primos e negativo e a quantidade de cada.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numerosParesList = new ArrayList<>();
		ArrayList<Integer> numerosImparesList = new ArrayList<>();

		int numero = 0;

		System.out.println("Quantos numeros você quer testar? ");
		numero = scanner.nextInt();

		int[] pares = new int[numero];

		for (int i = 0; i < numero; i++) {
			System.out.printf("Digite o %do numero: ", i + 1);
			pares[i] = scanner.nextInt();

			if (pares[i] < 0) {
				System.out.println("Numero negativo.");
			} else if (pares[i] % 2 == 0) {
				System.out.println("Numero Par.");
				numerosParesList.add(pares[i]);

			} else if (pares[i] % 2 != 0) {
				System.out.println("Numero Impar.");
				numerosImparesList.add(pares[i]);
			} else {
				System.out.println("Numero Invalido.");

			}

			System.out.println("Quantidade de numeros pares: " + numerosParesList);
			System.out.println("Quantidade de numeros impares: " + numerosImparesList);

			scanner.close();

		}

	}
}