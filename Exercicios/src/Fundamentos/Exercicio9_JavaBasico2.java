package Fundamentos;
import java.util.Scanner;
public class Exercicio9_JavaBasico2 {

	public static void main(String[] args) {
		int soma = 0;
		for(int x=0;x<20;x++) {
			if(x%3 == 0 && x%5 == 0) {
				soma = x + soma;
				
			}
			
		}
		System.out.println(soma);
	}

}
