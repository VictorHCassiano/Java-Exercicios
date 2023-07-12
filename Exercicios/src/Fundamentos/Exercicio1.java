package Fundamentos;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		float resposta = sc.nextInt();
		if (resposta>0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		sc.close();
	}

}
