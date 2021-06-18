package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
	
	public static void main(String[] args) {
		String cpf = "862.883.667-57";
		String cnpj = "52.228.128/0001-00";
		String tituloEleitor = "417453530116";
		CPFFormatter formatadorCPF = new CPFFormatter();
		String cpfSemFormatacao =  formatadorCPF.unformat(cpf);
		System.out.println(cpf);
		System.out.println(cpfSemFormatacao);
		CNPJFormatter formatadorCNPJ = new CNPJFormatter();
		String cnpjSemFormatacao = formatadorCNPJ.unformat(cnpj);
		System.out.println(cnpj);
		System.out.println(cnpjSemFormatacao);
		TituloEleitoralFormatter formatadorTitulo = new TituloEleitoralFormatter();
		String tituloEleitorFormatado = formatadorTitulo.format(tituloEleitor);
		System.out.println(tituloEleitor);
		System.out.println(tituloEleitorFormatado);
		
		
		
		
		
		
		
		
		
		
		
	}

}
