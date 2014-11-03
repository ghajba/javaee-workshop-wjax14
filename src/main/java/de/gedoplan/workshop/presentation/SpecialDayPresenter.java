package de.gedoplan.workshop.presentation;

import java.util.List;

import javax.enterprise.context.RequestScoped;
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
@RequestScoped
public class SpecialDayPresenter {

    @Inject
    private SpecialDayRepository specialDayRepository;

    @Inject
    @All
    private List<SpecialDay> specialDays;

    public List<SpecialDay> getSpecialDays() {
        return this.specialDays;
    }

    // @PostConstruct
    // void init() {
    // this.specialDays = this.specialDayRepository.findAll();
    // }
}
