package br.com.myAPP.controller;

import br.com.myAPP.controller.api.ProdutoController;
import br.com.myAPP.dao.api.ProdutoDAO;
import br.com.myAPP.model.Produto;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ProdutoControllerImpl implements ProdutoController {

    @EJB
    private ProdutoDAO produtoDAO;

    @Override
    public Produto salvar(Produto produto) {
        produtoDAO.salvar(produto);
        return  produto;
    }

    @Override
    public List<Produto> listarProdutos (){
        return (List<Produto>) produtoDAO.consultar(Produto.class);
    }

    @Override
    public void deletar(Integer id){
        Produto produto = new Produto();
        produto.setIdProduto(id);
        produtoDAO.deletar(produto);

    }

}
