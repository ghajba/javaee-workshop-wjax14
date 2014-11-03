package de.gedoplan.workshop.presentation;

import java.util.List;

import javax.enterprise.inject.Produces;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.persistence.All;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Named(value = "talkPresenter")
@FlowScoped("talk")
public class TalkPresenter {

    @Inject
    @All
    private List<Talk> talks;

    @Produces
    @Current
    private Talk currentTalk;

    public List<Talk> getTalks() {
        return this.talks;
    }

    public String select(Talk talk) {
        this.currentTalk = talk;
        return "talkEdit.xhtml";
    }
}
