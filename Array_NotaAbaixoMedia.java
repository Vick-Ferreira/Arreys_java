
import java.util.Locale;
import java.util.Scanner;

public class Array_NotaAbaixoMedia {
	// Descobrir a média das notas adicionadas e ver qual está abaixo da média.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double media;
		double soma;
		int nota;

		System.out.println("Quantas notas serão adicionadas?");
		nota = scanner.nextInt();

		double[] notas = new double[nota];

		for (int i = 0; i < nota; i++) {
			System.out.printf("Digite a %da nota: ", i + 1);
			notas[i] = scanner.nextDouble();
		}
		// media = soma / nota
		soma = 0.0;
		for (int i = 0; i < nota; i++) {
			soma = soma + notas[i];
		}

		media = soma / nota;
		System.out.printf("\nA média das notas é : %.2f \n", media);

		System.out.print("\nNotas abaixo da média : ");
		for (int i = 0; i < nota; i++) {
			if (notas[i] < media) {
				System.out.print(notas[i] + " ");

			}
		}

		scanner.close();

	}

}
