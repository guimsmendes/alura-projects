package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {
	
	public static void main(String[] args) {
		String cpf = "862.883.667-57";
		try{
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF VÁLIDO");
			
		}catch (InvalidStateException e) {
			System.out.println("CPF INVÁLIDO : " + e);
		}
		String cnpj = "18022756000105";
		try{
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ VALIDO");
			
		}catch (InvalidStateException e) {
			System.out.println("CNPJ INVALIDO : " + e);
		}
		String tituloEleitor = "417453530116";
		try{
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("TITULO VALIDO");
			
		}catch (InvalidStateException e) {
			System.out.println("TITULO INVALIDO : " + e);
		}
		
		
	}
	
	private static void validarDocumentos(Validator<String> validador, String documento){
		validador.assertValid(documento);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
