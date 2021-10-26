package br.com.alura.textblock;

public class Teste {

	// Novidade do Java 13 - Text Blocks
	public static void main(String[] args) {
		@SuppressWarnings("preview")
		String textoFormatado = """
				Lorem ipsum dolor sit amet,
				consectetur adipiscing elit, sed do eiusmod tempor
				incididunt ut labore et dolore magna aliqua.
				Ut enim ad minim veniam, quis nostrud exercitation
				ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit
				in voluptate velit esse cillum dolore eu fugiat
				nulla pariatur. Excepteur sint occaecat cupidatat
				non proident, sunt in culpa qui officia deserunt
				mollit anim id est laborum.
				""";
		System.out.println(textoFormatado);
	}
}
