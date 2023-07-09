package w3resources_Exercicios_java;
import java.util.Scanner;
public class E7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int x = 0; x<10;x++) {
			System.out.printf("%d X %d = %d\n",i,x,(i*x));
			
		}
		
		sc.close();
	}
}
