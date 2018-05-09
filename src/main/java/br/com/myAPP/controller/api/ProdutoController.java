package br.com.myAPP.controller.api;


import br.com.myAPP.model.Produto;

import java.util.List;

public interface ProdutoController {

    public Produto salvar (Produto produto);

    List<Produto> listarProdutos();

    void deletar(Integer id);
}
