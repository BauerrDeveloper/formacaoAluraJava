package br.com.rodrigo.testStrings;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Bauer Paulo "; // objeto literal.
		System.out.println("String Original: " + nome);
		System.out.println("");

		String replace = nome.replace("B", "b");
		System.out.println("String depois do replace: " + replace);

		String lowerCase = nome.toLowerCase();
		System.out.println("String depois do LowerCase: " + lowerCase);

		String upperCase = nome.toUpperCase();
		System.out.println("String depois do UperCase: " + upperCase);

		char c = 'B';
		char d = 'b';
		String doChar = nome.replace(c, d);
		System.out.println("String depois do char: " + doChar);

		char at = nome.charAt(2);
		System.out.println("Posi��o 2 tem o seguinte caracter: " + at);

		int pos = nome.indexOf("ue");
		System.out.println("A posi��o do (ue) dentro da String � a:  " + pos);

		String subString = nome.substring(1);
		System.out.println("A substring a partir da posi��o 1 �: " + subString);

		System.out.println("A String tem " + nome.length() + " caracteres.");

		for (int i = 0; i < nome.length(); i++) {
			System.out.println("O caractere na posi��o " + (i) + " �: " + nome.charAt(i));
		}

		System.out.println(" ");
		String vazio = "";
		System.out.println("Verificando se uma String est� vazia: ");
		if (vazio.isEmpty()) {
			System.out.println("Sim, a string est� vazia.");
		} else {
			System.out.println(
					"T� vazio n�o. N�o t� vendo? Quer que eu desenhe???" + " Olha aqui o que est� escrito: " + vazio);
		}

		String meuNome = "               Rodrigo Paulo Bauernfeind              ";
		System.out.println("Meu nome antes do uso do trim(); --> " + meuNome);
		String trim = meuNome.trim();
		System.out.println("Meu nome ap�s o uso do trim(); --> " + trim);

		System.out.println("");
		System.out.println("Nome, voc� cont�m (uer)?");
		
		
		
		if (nome.contains("uer")) {
			System.out.println("Sim, verdadeiro. Meu nome tem (uer).");
		} else {
			System.out.println("N�o. False. N�o sabe teu pr�prio nome n�o??");
		}

		
		System.out.println("");
		System.out.println("Veja o c�digo sem usar  o StringBuilder: ");
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("�nibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto);

		System.out.println("Veja o mesmo c�digo usando o StringBuilder: ");
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("�nibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto2 = builder.toString();
		System.out.println(texto2);

	}
}
