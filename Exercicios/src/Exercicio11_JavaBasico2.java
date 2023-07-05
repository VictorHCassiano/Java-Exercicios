import java.util.Scanner;
public class Exercicio11_JavaBasico2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de alunos");
		int numero_alunos = sc.nextInt();
		
		int nota_alunos[] = new int[numero_alunos];
		float media = 0;
		
		for(int x=0;x<numero_alunos;x++) {
			System.out.println("Digite a nota do aluno "+(x+1) );
			nota_alunos[x] = sc.nextInt();
			
		}

		for(int x:nota_alunos) {
			media = x+media;
			
		}
		media = media/numero_alunos;
		
		System.out.println("A media dos alunos eh "+media);
	}

}
