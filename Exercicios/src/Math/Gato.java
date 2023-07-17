package Math;

public class Gato extends Animal{

	public Gato(String nome,int idade) {
		super(nome,idade);
		
	}
	public void emitirSom() {
		System.out.printf("%s esta miando\n", this.nome);
	}
	public void locomover() {
		System.out.printf("%s esta correndo\n",this.nome);
	}
}
