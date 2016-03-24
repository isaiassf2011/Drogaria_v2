package br.com.isaias.drogaria.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import br.com.isaias.drogaria.dao.ProdutoDAO;
import br.com.isaias.drogaria.domain.Produto;

//http://127.0.0.1:8080/Drogaria/rest/produto
@Path("produto")
public class ProdutoService {
	
	@GET
	public String listar(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> produtos = produtoDAO.listar("descricao");
		
		Gson gson = new Gson();
		String json = gson.toJson(produtos);
		
		return json;
	}

}
