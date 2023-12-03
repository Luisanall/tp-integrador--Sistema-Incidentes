package dao;

import configuracion.DBConfig;
import models.tarea;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class tareaDao {
    EntityManager entityManager = null;
    //crud
    public void   create(tarea unatarea){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx =  entityManager.getTransaction();
        tx.begin();
        entityManager.persist(unatarea);
        tx.commit();


    }
    public tarea update (tarea unatarea){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx =  entityManager.getTransaction();
        tx.begin();
       tarea tareaActualizada = entityManager.merge(unatarea);
        tx.commit();
        return  tareaActualizada;


    }
    public void   delete (tarea unatarea){
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx =  entityManager.getTransaction();
        tx.begin();
        entityManager.remove(unatarea);
        tx.commit();


    }
}
