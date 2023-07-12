package Metodos;

public class ClassePessoa {

	public static void main(String[] args) {
		JavaMetodos pessoa1  = new JavaMetodos();
		int idade = pessoa1.idade();
		String nome = pessoa1.nome();
		double valor = pessoa1.valor();
		boolean estado = pessoa1.estado();

		System.out.println("Nome:" + nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Valor: "+ valor);
		System.out.println("Estado: "+ estado);
		

	}

}
