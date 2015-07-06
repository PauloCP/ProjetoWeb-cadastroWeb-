package br.com.paulocp.jdbc.classes;

import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato: contatos){
			System.out.println("Nome:" + contato.getNome());
			System.out.println("E-mail:" + contato.getEmail());
			System.out.println("Endere�o:" + contato.getEndereco());
			System.out.println("Data de nascimento:" + contato.getDataNascimento().getTime() + "\n");
			
		}
	}

}
