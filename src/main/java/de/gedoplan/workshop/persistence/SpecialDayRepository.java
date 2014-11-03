package de.gedoplan.workshop.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.gedoplan.workshop.domain.SpecialDay;

/**
 * @author GHajba 2014 nov. 3
 *
 */
public class SpecialDayRepository {

    @PersistenceContext(unitName = "default")
    EntityManager entityManager;

    public void persist(SpecialDay specialDay) {
        this.entityManager.persist(specialDay);
    }

    public List<SpecialDay> findAll() {
        final TypedQuery<SpecialDay> query = this.entityManager.createQuery("from SpecialDay", SpecialDay.class);
        return query.getResultList();
    }
}
