package Math;

public class Calculadora {

	public static void main(String[] args) {
		Operacoes op1 = new Operacoes();
		Operacoes op2 = new Operacoes(2,3);
		Operacoes op3 = new Operacoes(5,6,7);
		
		op2.somar(66,2);
		op3.dividir(2, 2);
		op3.dividir(1000, 6, 9);
		op3.multiplicar(5, 5);
		op3.multiplicar(6, 8, 2);
		op3.somar(10, 10, 10);
		op1.subtracao(10, 3, 2);
		
	}

}
