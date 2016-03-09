package br.com.isaias.drogaria.dao;

import java.util.Date;

import org.junit.Test;

import br.com.isaias.drogaria.domain.Funcionario;
import br.com.isaias.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {
	
	@Test
	public void salvar(){
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = pessoaDAO.buscar(2L);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCarteiraTrabalho("123456");
		funcionario.setDataAdmissao(new Date());
		funcionario.setPessoa(pessoa);
		
		funcionarioDAO.salvar(funcionario);
	}

}
