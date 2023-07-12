package Fundamentos;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota:");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a segunda nota:");
		float nota2 = sc.nextFloat();
		
		
		System.out.println("Media:"+ (nota1+nota2)/2);
		
		
		
		sc.close();
	}

}
