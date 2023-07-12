package Fundamentos;

public class Exercicio12_JavaBasico2 {

	public static void main(String[] args) {
		int arraynum[] = {87,68,52,5,49,83,45,12,64};
		int total = 0;
		for(int i : arraynum)total+=1;
		
		System.out.printf("Total de elementos no array: %d",total);

	}

}
