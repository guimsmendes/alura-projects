package br.com.alura;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import br.com.alura.http.dao.LivroDAO;
import br.com.alura.modelo.dominio.Livro;
import br.com.alura.modelo.dominio.NotaFiscal;
import br.com.alura.nf.util.NotaFiscalUtil;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Listando todos os livros");
		List<Livro> livros = new LivroDAO().listar();

		IntStream.range(0, livros.size()).forEach(i -> {
			System.out.println(i + " - " + livros.get(i).getNome());
		});

		Scanner scn = new Scanner(System.in);
		System.out.println("Qual livro deseja?");
		Integer numero = scn.nextInt();

		System.out.println("Livro escolhido é o: " + livros.get(numero).getNome());

		System.out.println("Favor inserir seu nome para gerar nota fiscal");
		String nome = scn.next();

		NotaFiscalUtil util = new NotaFiscalUtil();

		util.emitir(new NotaFiscal(nome));

		System.out.println("Obrigado!!");

		Scanner scan = new Scanner(System.in);
		scan.nextLine();

		util.fechar();
		scn.close();
		scan.close();

	}

}
