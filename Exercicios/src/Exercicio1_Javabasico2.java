import java.util.Scanner;
public class Exercicio1_Javabasico2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sua sala?");
		int alunos = sc.nextInt();
		int cont = 0;
		float notas_alunos = 0;
		while(cont<alunos) {
			System.out.println("Digite a nota do aluno "+(cont+1));
			notas_alunos = sc.nextFloat()+notas_alunos;
			cont++;
			
			
		}
		float media = notas_alunos/alunos;
		System.out.println(media);
		sc.close();
	}

}
