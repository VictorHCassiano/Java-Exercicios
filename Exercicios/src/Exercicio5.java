import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu sexo\nF-feminino\nM-Masculino\nO-Outros: ");
		String sexo = sc.next();
		
		if(sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f') {
			System.out.println("Feminino");	
		}
		else if(sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm'){
			System.out.println("Masculino");
			
		}
		else if(sexo.charAt(0) == 'O' || sexo.charAt(0) == 'o') {
			System.out.println("Outros");
		}
		else {
			System.out.println("Sexo invalido");
		}
		
		sc.close();
	}
	
}
