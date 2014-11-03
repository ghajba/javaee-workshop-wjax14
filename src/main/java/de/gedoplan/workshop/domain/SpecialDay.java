package de.gedoplan.workshop.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Entity
public class SpecialDay extends SingleIdEntity<String> {

    @Id
    private String id;

    private String name;

    protected SpecialDay() {
    }

    public SpecialDay(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
