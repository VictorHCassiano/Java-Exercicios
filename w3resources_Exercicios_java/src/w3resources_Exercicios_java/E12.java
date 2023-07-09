package w3resources_Exercicios_java;
import java.util.Scanner;
public class E12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres numeros:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		System.out.println("A media dos 3 numeros eh "+(n1+n2+n3)/3);
	}

}
