import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int maior;
		int menor;
		if(n1>n2 && n1>n3) {
			maior=n1;
		}
		else if(n2>n1 && n2>n3) {
			maior=n2;
		}
		else {
			maior=n3;
		}
		if(n1<n2 && n1<n3) {
			menor=n1;
		}
		else if(n2<n1&&n2<n3) {
			menor = n2;
			
		}
		else {
			menor = n3;
		}
		System.out.println("Maior: "+maior +"\nMenor: "+menor);
		sc.close();
		
		
		
		
		
		
	}

}
