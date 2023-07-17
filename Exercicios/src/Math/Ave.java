package Math;

public class Ave extends Animal{
	public Ave(String nome,int idade) {
		super(nome,idade);
		
	}
	public void emitirSom() {
		System.out.printf("%s esta piando\n", this.nome);
	}
	public void locomover() {
		System.out.printf("%s esta voando\n",this.nome);
	}
}
