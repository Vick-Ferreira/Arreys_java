import java.util.Locale;
import java.util.Scanner;

public class Array_AlunosAprovados {
	// Compara notas dos semestre e confere se aluno foi aprovado ou reprovado.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int alunos;
		double media;

		System.out.println("Quantos alunos serão digitados?");
		alunos = scanner.nextInt();

		String[] nomeAluno = new String[alunos];
		double[] primeiro_Semestre = new double[alunos];
		double[] sugundo_Semestre = new double[alunos];

		for (int i = 0; i < alunos; i++) {
			System.out.printf("Digite o nome do %do aluno:", i + 1);
			nomeAluno[i] = scanner.next();
			System.out.println("Nota do 1º Semestre: ");
			primeiro_Semestre[i] = scanner.nextDouble();
			System.out.println("Nota do 2º Semestre: ");
			sugundo_Semestre[i] = scanner.nextDouble();

		}

		media = 0.0;
		for (int i = 0; i < alunos; i++) {
			media = (primeiro_Semestre[i] + sugundo_Semestre[i]) / 2;
			if (media >= 6.0) {
				System.out.printf("Alunos APROVADO: %s Média: %.2f\n", nomeAluno[i], media);
			} else {
				System.out.printf("Alunos REPROVADO: %s Média: %.2f\n", nomeAluno[i], media);
			}

		}

		scanner.close();

	}

}
