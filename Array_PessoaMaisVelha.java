import java.util.Scanner;

public class Array_PessoaMaisVelha {
	// Criar um array fixo, e descobrir qual a pessoa mais velha;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroPessoas;
		int idade;
		int posicaoInicial;

		System.out.println("Quantas pessoas você quer adicionar ao array?");
		numeroPessoas = scanner.nextInt();
		scanner.nextLine();

		String[] pessoas = new String[numeroPessoas];
		int[] idades = new int[numeroPessoas];

		for (int i = 0; i < numeroPessoas; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			System.out.print("Nome: ");
			pessoas[i] = scanner.nextLine();
			System.out.print("Idade: ");
			idades[i] = scanner.nextInt();
			scanner.nextLine();
		}

		idade = idades[0];
		posicaoInicial = 0;

		for (int i = 0; i < numeroPessoas; i++) {
			if (idades[i] > idade) {
				idade = idades[i];
				posicaoInicial = i;

			}

		}
		System.out.printf("A pessoa mais velha é : %s%n", pessoas[posicaoInicial]);

		scanner.close();

	}

}
