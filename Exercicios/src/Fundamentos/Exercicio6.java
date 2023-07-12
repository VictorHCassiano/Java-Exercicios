package Fundamentos;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.println("Faremos um interrogatorio agora acerca de um crime, apenas responta com: \nS- para sim\nN- para nao");
		
		System.out.println("Telefonou para a vitima?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's'||resposta == 'S') {
			cont++;
		}
		System.out.println("Esteve no local do crime?");
		resposta = sc.next().charAt(0);
		if (resposta == 's'||resposta == 'S') {
			cont++;
		}
		System.out.println("Mora perto da vitima?");
		resposta = sc.next().charAt(0);
		if (resposta == 's'||resposta == 'S') {
			cont++;
		}
		System.out.println("Devia para a vitima?");
		resposta = sc.next().charAt(0);
		if (resposta == 's'||resposta == 'S') {
			cont++;
		}
		System.out.println("Ja trabalhou com a vitima?");
		resposta = sc.next().charAt(0);
		if (resposta == 's'||resposta == 'S') {
			cont++;
		}
		if (cont == 2) {
			System.out.println("Suspeito");
		}
		else if(cont == 3||cont == 4) {
			System.out.println("Cumplice");
		}
		else if(cont == 5) {
			System.out.println("Assassino");
		}
		else {
			System.out.println("Inocente");
		}
		
		
		sc.close();
	}

}
