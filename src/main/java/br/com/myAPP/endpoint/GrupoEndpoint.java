package br.com.myAPP.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.myAPP.controller.api.GrupoController;
import br.com.myAPP.model.Grupo;

@Path("grupo")
@Produces({MediaType.APPLICATION_JSON})
@Stateless
public class GrupoEndpoint{

    @EJB
    private GrupoController grupoController;

    @GET
    public Response findGrupos(){
        List<Grupo> grupos = new ArrayList<>();
        grupos = grupoController.listarGrupos();

        return Response.ok(grupos).header("Access-Control-Allow-Origin", "*").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response salvar(Grupo grupo) {
        grupo = grupoController.salvar(grupo);
        return Response.ok(grupo).header("Access-Control-Allow-Origin", "*").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response deletar (final @PathParam("id") Integer id){
        grupoController.deletar(id);
        return Response.ok().header("Access-Control-Allow-Origin", "*").build();
    }



}
