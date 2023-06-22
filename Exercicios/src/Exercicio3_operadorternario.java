import java.util.Scanner;
public class Exercicio3_operadorternario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int dia = sc.nextInt();
		
		System.out.println((dia==1)? "Domingo":(dia==2?"Segunda":(dia==3?"Terça":(dia==4?"Quarta":(dia==5?"Quinta":(dia==6?"Sexta":(dia==7?"Sabado":null)))))));

	}

}
