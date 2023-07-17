package Math;

public class Operacoes {

	private int n1,n2,n3;
	public Operacoes(){
		
	}
	public Operacoes(int numero1,int numero2) {
		this.n1 = numero1;
		this.n2 = numero2;
	}
	public Operacoes(int numero1,int numero2,int numero3) {
		this.n1= numero1;
		this.n2= numero2;
		this.n3= numero3;
	}
	public void somar() {
		System.out.println(this.n1+this.n2+this.n3);
	}
	public void somar(int n1, int n2){
		System.out.println(n1+n2);
	}
	public void somar(int n1,int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	public void dividir(int n1,int n2) {
		System.out.println(n1/n2);
	}
	public void dividir(int n1,int n2,int n3) {
		System.out.println(n1/n2/n3);
	}
	public void multiplicar(int n1,int n2) {
		System.out.println(n1*n2);
	}
	public void multiplicar(int n1,int n2,int n3) {
		System.out.println(n1*n2*n3);
	}
	public void subtracao(int n1,int n2,int n3) {
		System.out.println(n1-n2-n3);
	}
	public void subtracao(int n1,int n2) {
		System.out.println(n1-n2);
	}
}
