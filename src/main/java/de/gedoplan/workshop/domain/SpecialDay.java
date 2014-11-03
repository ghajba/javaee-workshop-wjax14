package de.gedoplan.workshop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Entity
public class SpecialDay {

    @Id
    private String id;

    private String name;

    protected SpecialDay() {
    }

    public SpecialDay(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
