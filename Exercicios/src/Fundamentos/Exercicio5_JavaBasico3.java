package Fundamentos;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Exercicio5_JavaBasico3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma frase");
		String palavra = sc.nextLine();
		StringTokenizer contador = new StringTokenizer(palavra);
		System.out.println("O numero de palavas foi "+ contador.countTokens());
		
	}

}
