package de.gedoplan.workshop.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@ApplicationScoped
public class EntityManagerProducer {

    // @PersistenceContext(unitName = "default")
    // @Produces
    // private EntityManager entityManager;

    //
    // @PersistenceContext(unitName = "test")
    // @Produces
    // @Test
    // private EntityManager testEntityManager;

    // @Produces
    // private EntityManager getEntityManager() {
    // return this.entityManager;
    // }

    @PersistenceUnit(unitName = "default")
    EntityManagerFactory entityManagerFactory;

    @Produces
    @RequestScoped
    EntityManager createEntityManager() {
        return this.entityManagerFactory.createEntityManager();
    }

    void closeEntityManager(@Disposes EntityManager entityManager) {
        entityManager.close();
    }

}
