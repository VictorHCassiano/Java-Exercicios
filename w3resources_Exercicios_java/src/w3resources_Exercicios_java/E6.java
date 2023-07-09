package w3resources_Exercicios_java;
import java.util.Scanner;
public class E6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Soma: "+ n1+n2);
		System.out.println("Subtracao: "+ (n1-n2));
		System.out.println("Multiplicacao: "+ n1*n2);
		System.out.println("Divisao: "+ n1/n2);
		System.out.println("Resto da divisao: "+ n1%n2);
		
		sc.close();
	}

}
