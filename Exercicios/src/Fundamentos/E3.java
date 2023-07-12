package Fundamentos;

public class E3 {

	public static void main(String[] args) {
		String VIDA[] ={"a", "vida", "eh", "bela"};
		String resultado = "";
		String resultado2 = "";
		for(int x = VIDA.length-1;x>=0;x--) {
			resultado += VIDA[x]+" ";
			
		}
		for(String i : VIDA) {
			resultado2 = i +" " +resultado2 ;
		}
		System.out.println(resultado2);
		System.out.println(resultado);
	}

	}


