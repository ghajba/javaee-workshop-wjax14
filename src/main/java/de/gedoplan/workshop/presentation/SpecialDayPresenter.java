package de.gedoplan.workshop.presentation;

import java.io.Serializable;
import java.util.List;

import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.gedoplan.workshop.domain.SpecialDay;
import de.gedoplan.workshop.persistence.All;
import de.gedoplan.workshop.persistence.SpecialDayRepository;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Named(value = "specialDayPresenter")
@FlowScoped("specialDay")
public class SpecialDayPresenter implements Serializable {

    private static final long serialVersionUID = 4112938102448419933L;

    @Inject
    private SpecialDayRepository specialDayRepository;

    @Inject
    @All
    private List<SpecialDay> specialDays;

    public List<SpecialDay> getSpecialDays() {
        return this.specialDays;
    }

    public String save() {
        for (final SpecialDay sd : this.specialDays) {
            this.specialDayRepository.merge(sd);
        }

        return "exit";
    }

    public void add() {
        this.specialDays.add(new SpecialDay(null, null));
    }

    // @PostConstruct
    // void init() {
    // this.specialDays = this.specialDayRepository.findAll();
    // }
}
