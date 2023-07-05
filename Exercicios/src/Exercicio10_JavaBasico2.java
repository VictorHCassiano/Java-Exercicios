
public class Exercicio10_JavaBasico2 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		for(int x = 9;x>=0;x--) {
			
			numeros[9-x] = x+1;
			
		}
		for(int n: numeros) {
			System.out.print(n+" ");
			
		}
		
		System.out.println("\n");
		int numeros2[] = new int[11];
		
		for(int x = 0;x<=10;x++) {
			numeros2[x] = x*x;
			
		}
		
		for(int n: numeros2) {
			System.out.print(n+" ");
			
		}
		System.out.println("\n");
		int numeros3[] = new int[10];
		for(int x = 0;x<10;x++) {
			if(x >= 5) {
				numeros3[x] = (x-4)*10;	
			}
			else {
				numeros3[x] = x+1;	
			}
			
		}
		for(int n: numeros3) {
			System.out.print(n+" ");
			
		}
		System.out.println("\n");
		int numeros4[] = new int[10];
		//3 4 7 12 19 28 39 52 67 84 nao entendi a logica
		
		
		
	}
	
}
