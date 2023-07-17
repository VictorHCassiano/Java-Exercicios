package Math;

public class Fazenda {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Bob",11);
		Gato gato1 = new Gato("George",3);
		Ave ave1 = new Ave("Hugo",1);
		gato1.locomover();
		gato1.emitirSom();
		cachorro1.locomover();
		cachorro1.emitirSom();
		ave1.emitirSom();
		ave1.locomover();

	}

}
