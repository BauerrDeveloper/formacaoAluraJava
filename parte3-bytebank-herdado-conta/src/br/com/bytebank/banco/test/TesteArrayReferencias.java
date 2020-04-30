package br.com.bytebank.banco.test;



import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println("Na posi��o 0 do meu array: " + contas[0].toString());
		System.out.println(contas[1].toString());
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
	}
}
