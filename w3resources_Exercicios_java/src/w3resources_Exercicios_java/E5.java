package w3resources_Exercicios_java;
import java.util.Scanner;
public class E5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.printf("%d X %d = %d",n1,n2,n1*n2);
		sc.close();
	}

}
