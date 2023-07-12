package Fundamentos;

public class Exercicio6_JavaBasico3 {

	public static void main(String[] args) {
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		boolean comp;
		System.out.println(texto01.compareTo(texto02)== 0 ? true:false);
		comp = texto01.equals(texto02);
		System.out.println(comp);
		//qual a diferenca entre Equals para compareTo?
		
	}

}
