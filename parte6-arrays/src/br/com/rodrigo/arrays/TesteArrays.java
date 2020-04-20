package br.com.rodrigo.arrays;

public class TesteArrays {

	public static void main(String[] args) {
		
		int[] idades = new int[5];//inicializa com os valores padrões. No caso int = 0;
		

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i *i;
			}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
	
}

		
		
	


