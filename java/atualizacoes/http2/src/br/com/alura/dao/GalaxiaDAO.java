package br.com.alura.dao;

import java.util.List;
import java.util.Map;

public class GalaxiaDAO {

	public void listar() {
		Map<String, List<String>> galaxias = Map.of("nome",
				List.of("A Pequena Nuvem de Magalhães", "A Grande Nuvem de Magalhães", "A galáxia de Andrômeda"));
		System.out.println("[" + galaxias + "]");
	}
}
