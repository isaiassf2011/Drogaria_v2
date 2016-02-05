package br.com.isaias.drogaria.dao;

import org.junit.Test;

import br.com.isaias.drogaria.domain.Fabricante;

public class FabricanteDAOTest {
	
	@Test
	public void salvar(){
		Fabricante fabricante = new Fabricante();
		fabricante.setNome("Aché");
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}

}
