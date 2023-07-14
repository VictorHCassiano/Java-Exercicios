package Metodos;

public class Carro {
	private String cor;
	private double preco;
	private String modelo;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, double preco) {
		this.cor = "PRETA";
		this.modelo= modelo;
		this.preco= preco;
		
	}
	
	public Carro(String modelo, double preco, String cor) {
		this.modelo= modelo;
		this.cor = cor;
		this.preco = preco;
		
	}
	
}
