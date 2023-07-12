package Fundamentos;
import java.util.Scanner;

public class Exercicio1_operadorternario {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite um numero: ");
			float resposta = sc.nextFloat();
			System.out.println((resposta>0) ? "Positivo":"Negativo");
				
			sc.close();

	}

}
