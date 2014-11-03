package de.gedoplan.workshop.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@ApplicationScoped
public class EntityManagerProducer {

    @PersistenceContext(unitName = "default")
    @Produces
    private EntityManager entityManager;

    @PersistenceContext(unitName = "test")
    @Produces
    @Test
    private EntityManager testEntityManager;

    // @Produces
    // private EntityManager getEntityManager() {
    // return this.entityManager;
    // }

}
