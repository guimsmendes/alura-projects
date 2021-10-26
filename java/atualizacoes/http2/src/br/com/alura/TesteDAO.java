package br.com.alura;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import br.com.alura.dao.CriaturaDAO;
import br.com.alura.dao.GalaxiaDAO;
import br.com.alura.dao.PlanetaDAO;

public class TesteDAO {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		new PlanetaDAO().listar();

		new CriaturaDAO().listar();

		new GalaxiaDAO().listar();

		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.close();
	}
}
