package br.com.isaias.drogaria.dao;

import java.text.ParseException;

import org.junit.Test;

import br.com.isaias.drogaria.domain.Cidade;
import br.com.isaias.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	
	@Test
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		pessoa.setBairro("Bairro A");
		pessoa.setCelular("4899556644");
		pessoa.setCep("7800000");
		Cidade cidade = new CidadeDAO().buscar(1L);
		pessoa.setCidade(cidade);
		pessoa.setCpf("10012531910");
		pessoa.setEmail("isaiassf2011@hotmail.com");
		pessoa.setNome("Isaias");
		pessoa.setNumero(new Short("123"));
		pessoa.setRg("123456789");
		pessoa.setRua("Rua X");
		pessoa.setTelefone("4899556644");
		pessoaDAO.salvar(pessoa);
	}

}
