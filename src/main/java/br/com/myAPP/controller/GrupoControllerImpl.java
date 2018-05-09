package br.com.myAPP.controller;

import br.com.myAPP.controller.api.GrupoController;
import br.com.myAPP.dao.api.GrupoDAO;
import br.com.myAPP.model.Grupo;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Stateless
public class GrupoControllerImpl implements GrupoController {

    @EJB
    private GrupoDAO grupoDAO;

    @Override
    public Grupo salvar(Grupo grupo) {
        grupoDAO.salvar(grupo);
        return  grupo;
    }

    @Override
    public List<Grupo> listarGrupos (){
        return (List<Grupo>) grupoDAO.consultar(Grupo.class);
    }

    @Override
    public void deletar(Integer id){
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(id);
        grupoDAO.deletar(grupo);

    }



}
