package Math;

public abstract class Animal {
	String nome;
	int idade;
	public Animal(){
		
	}
	
	public Animal(String nome,int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public Animal(String nome) {
		this.nome= nome;
	}
	
	public void locomover() {
		
		System.out.printf("%s esta se locomovendo \n",this.nome);
	}
	public void emitirSom() {
		
		System.out.println("Som");
	}
	
}
