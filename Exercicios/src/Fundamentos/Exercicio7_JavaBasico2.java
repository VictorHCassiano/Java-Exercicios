package Fundamentos;
import java.util.Scanner;
public class Exercicio7_JavaBasico2 {

	public static void main(String[] args) {
		System.out.println("Digite um numero");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			if (x%2==0) {
				x=x/2;
			}
			else {
				x=3*x+1;
			}
			System.out.print(x+" ");
		}
		sc.close();
	}

}
