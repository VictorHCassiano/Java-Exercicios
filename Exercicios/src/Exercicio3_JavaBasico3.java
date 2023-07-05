
public class Exercicio3_JavaBasico3 {

	public static void main(String[] args) {
		String str = "Hello World World2";
		int pos = str.indexOf("l");
		int pos2 = str.lastIndexOf("l");
		System.out.println(pos);
		System.err.println(pos2);

		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java")==0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA")==0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA")== 0 ? true : false);
	}

}
