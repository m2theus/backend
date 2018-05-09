package br.com.myAPP.dao;
import javax.inject.Named;

import br.com.myAPP.dao.api.GenericDAO;
import br.com.myAPP.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class GenericDAOImpl implements GenericDAO {
    public List<?> consultar (Class classe){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria crit = session.createCriteria(classe);
        List results = crit.list();
        session.flush();
        session.close();
        return results;
    }

    public void salvar (Object objeto) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(objeto);
        session.getTransaction().commit();
        session.flush();
        session.close();
    }

    public void deletar (Object objeto){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(objeto);
        session.getTransaction().commit();
        session.flush();//LiberaMemoria
        session.close();
    }
}
