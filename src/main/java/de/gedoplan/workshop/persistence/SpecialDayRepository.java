package de.gedoplan.workshop.persistence;

import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import de.gedoplan.workshop.domain.SpecialDay;

/**
 * @author GHajba 2014 nov. 3
 *
 */
public class SpecialDayRepository {

    @Inject
    EntityManager entityManager;

    public void persist(SpecialDay specialDay) {
        this.entityManager.persist(specialDay);
    }

    @Produces
    @All
    public List<SpecialDay> findAll() {
        final TypedQuery<SpecialDay> query = this.entityManager.createQuery("from SpecialDay", SpecialDay.class);
        return query.getResultList();
    }
}
