import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Array_AddPessoasEDadosPessoais {
	// Adicionar pessoas e seus dados pessoas.
	// join da classe String, usado para concatenar os nomes da lista

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int numeroPessoas;
		int maiorIdade = 18;
		int menorIdade = 0;

		double soma = 0.0;
		double media = 0.0;
		int qtdMulheres = 0;
		int qtdHomens = 0;

		ArrayList<String> nomeMenorIdade = new ArrayList<>();

		System.out.println("Quantas pessoas serão adicionadas?");
		numeroPessoas = scanner.nextInt();

		// arrays fixos
		String[] nome = new String[numeroPessoas];
		char[] sexo = new char[numeroPessoas];
		int[] idade = new int[numeroPessoas];

		for (int i = 0; i < numeroPessoas; i++) {
			System.out.printf("Nome da %da pessoa: ", i + 1);
			nome[i] = scanner.next();
			System.out.printf("Sexo da %da pessoa (M/F): ", i + 1);
			sexo[i] = scanner.next().charAt(0);
			System.out.printf("Idade da %da pessoa: ", i + 1);
			idade[i] = scanner.nextInt();

		}

		for (int i = 0; i < numeroPessoas; i++) {
			if (idade[i] >= maiorIdade) {
				maiorIdade++;
			} else {
				menorIdade++;
				nomeMenorIdade.add(nome[i]);// adiciona nome ao array list
			}

		}

		for (int i = 0; i < numeroPessoas; i++) {
			if (sexo[i] == 'M') {
				qtdHomens++;
			} else {
				qtdMulheres++;
				soma = qtdMulheres;
			}
		}
		media = soma / qtdMulheres;

		System.out.println("Quantidade total de pessoas menores de idade: " + menorIdade);
		System.out.println("Nome pessoas menores de idade: " + String.join(", ", nomeMenorIdade));
		System.out.printf("Média da quantidade de  MULHERES = %.2f%n", media);
		System.out.println("Quantidade de mulheres: " + qtdMulheres);
		System.out.println("Quantidade de homens: " + qtdHomens);

		scanner.close();

	}

}
