package configuracion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class DBConfig {
    static EntityManagerFactory factory = null;
    public static EntityManager getEntityManager(){
       if (factory == null)
        factory = Persistence.createEntityManagerFactory ( "JPA_incidentes" );
       return factory.createEntityManager ();
    }

}
