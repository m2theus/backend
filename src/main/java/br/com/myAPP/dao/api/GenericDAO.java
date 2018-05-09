package br.com.myAPP.dao.api;

import java.util.List;

public interface GenericDAO {
    public List<?> consultar (Class classe);
    public void salvar (Object objeto);
    public void deletar (Object objeto);

}
