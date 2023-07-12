package Fundamentos;

public class Exercicio1_JavaBasico3 {

	public static void main(String[] args) {
		String str = "Hello World";
		String replace = str.replace("l", "w");
		
		replace = replace + " World";
		
		
		String resultado = str.substring(3,8);
		
		System.out.println(resultado);
		
		System.out.println(replace.toUpperCase());
		
		str = 3 + str + 3;
		
		System.out.println(replace);
		String teste = "  HelLLLLLOOOO   ";
		System.out.println(teste.trim());
		char chars[] = {'a','b','c'};
	
		String s = new String(chars);	
		System.out.println(s);
		
		System.out.println(str.charAt(1));
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		
		
	}

}
