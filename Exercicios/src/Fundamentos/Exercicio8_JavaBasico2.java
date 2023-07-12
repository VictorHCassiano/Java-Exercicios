package Fundamentos;
import java.util.Scanner;
public class Exercicio8_JavaBasico2 {

	public static void main(String[] args) {
		System.out.println("Digite o numero de alunos");
		Scanner sc = new Scanner(System.in);
		int alunos = sc.nextInt();
		float media = 0;
		for (int x = 0 ; x<alunos;x++) {
			System.out.println("Digite a nota do aluno "+(x+1));
			media = sc.nextFloat() + media;
			
			
		}
		media = media/alunos;
		System.out.print("A media da turma eh"+media);
		sc.close();
		
	}
	
}
