package de.gedoplan.workshop.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import de.gedoplan.workshop.domain.SpecialDay;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Transactional
public class SpecialDayRepository implements Serializable {

    private static final long serialVersionUID = -4809881143235601520L;

    @Inject
    EntityManager entityManager;

    public void persist(SpecialDay specialDay) {
        this.entityManager.persist(specialDay);
    }

    public void merge(SpecialDay specialDay) {
        this.entityManager.merge(specialDay);
    }

    @Produces
    @All
    public List<SpecialDay> findAll() {
        final TypedQuery<SpecialDay> query = this.entityManager.createQuery("from SpecialDay", SpecialDay.class);
        return query.getResultList();
    }

    public SpecialDay findById(String id) {
        return this.entityManager.find(SpecialDay.class, id);
    }
}
