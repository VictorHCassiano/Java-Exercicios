import java.util.Scanner;
public class Exercicio4_JavaBasico2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int n = sc.nextInt();
		int cont = 1;
		System.out.print("Numeros pares: ");
		while(cont<n) {
			if (cont%2 == 0){
			System.out.print(cont+" ");
			}
			cont++;
		}
		cont = 1;
		System.out.print("\nNumeros impares: ");
		while(cont<n) {
			if(cont%2 != 0 ) {
				System.out.print(cont+" ");
			}
			cont++;
		}
		
		
		
		
		sc.close();
	}

}
