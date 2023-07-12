package Metodos;

public class UsarSoma {

	public static void main(String[] args) {
		SomarMetodos soma = new SomarMetodos();
		int numero = soma.somar(10, 20);
		System.out.println(numero);
		int media = soma.media(10, 10);
		System.out.println(media);
	}

}
