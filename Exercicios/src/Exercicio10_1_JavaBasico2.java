import java.util.Scanner;
public class Exercicio10_1_JavaBasico2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros[] = new int[10];
		System.out.println("Array1");
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero "+(x+1));
			numeros[x] = sc.nextInt();
			
		}
		
		int numeros2[] = new int[10];
		System.out.println("Array2");
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero "+(x+1));
			numeros2[x] = sc.nextInt();
			
		}
		
		
		int numeros3[] = new int[10];
		System.out.println("Array3");
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero "+(x+1));
			numeros3[x] = sc.nextInt();
			
		}
		
		
		int numeros4[] = new int[10];
		System.out.println("Array4");
		for(int x=0;x<10;x++) {
			System.out.println("Digite o numero "+(x+1));
			numeros4[x] = sc.nextInt();
			
		}
		
		
		for(int x:numeros) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x:numeros2) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x:numeros3) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x:numeros4) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		sc.close();
	}
	
}
