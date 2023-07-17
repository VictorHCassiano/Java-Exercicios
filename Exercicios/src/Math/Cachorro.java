package Math;

public class Cachorro extends Animal{

	public Cachorro(String nome,int idade) {
		super(nome,idade);
		
	}
	public void emitirSom() {
		System.out.printf("%s esta latindo\n", this.nome);
	}
	public void locomover() {
		System.out.printf("%s esta correndo\n",this.nome);
	}
}
