package de.gedoplan.workshop.persistence;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import de.gedoplan.workshop.domain.Talk;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Transactional
public class TalkRepository implements Serializable {

    private static final long serialVersionUID = -3600737773397170775L;

    @Inject
    EntityManager entityManager;

    public void persist(Talk talk) {
        this.entityManager.persist(talk);
    }

    public void merge(Talk talk) {
        this.entityManager.merge(talk);
    }

    @Produces
    @All
    public List<Talk> findAll() {
        final TypedQuery<Talk> query = this.entityManager.createQuery("from Talk", Talk.class);
        return query.getResultList();
    }
}
