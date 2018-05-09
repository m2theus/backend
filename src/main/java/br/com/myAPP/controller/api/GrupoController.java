package br.com.myAPP.controller.api;

import br.com.myAPP.model.Grupo;

import java.util.List;

public interface GrupoController {

    public Grupo salvar (Grupo grupo);

    List<Grupo> listarGrupos();

    void deletar(Integer id);

}
