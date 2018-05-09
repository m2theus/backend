package br.com.myAPP.endpoint;

import br.com.myAPP.controller.api.GrupoController;
import br.com.myAPP.controller.api.ProdutoController;
import br.com.myAPP.model.Grupo;
import br.com.myAPP.model.Produto;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("produto")
@Produces({MediaType.APPLICATION_JSON})
@Stateless
public class ProdutoEndpoint{

    @EJB
    private ProdutoController produtoController;

    @GET
    public Response findProdutos(){
        List<Produto> produtos = new ArrayList<>();
        produtos = produtoController.listarProdutos();

        return Response.ok(produtos).header("Access-Control-Allow-Origin", "*").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response salvar(Produto produto) {
        produto = produtoController.salvar(produto);
        return Response.ok(produto).header("Access-Control-Allow-Origin", "*").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response deletar (final @PathParam("id") Integer id){
        produtoController.deletar(id);
        return Response.ok().header("Access-Control-Allow-Origin", "*").build();
    }
}
