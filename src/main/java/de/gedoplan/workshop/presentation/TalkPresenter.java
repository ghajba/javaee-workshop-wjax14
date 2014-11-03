package de.gedoplan.workshop.presentation;

import java.util.List;

import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.persistence.All;
import de.gedoplan.workshop.persistence.TalkRepository;

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
    private Talk currentTalk;

    @Inject
    TalkRepository talkRepository;

    public List<Talk> getTalks() {
        return this.talks;
    }

    public Talk getCurrentTalk() {
        return this.currentTalk;
    }

    public String select(Talk talk) {
        this.currentTalk = talk;
        return "talkEdit.xhtml";
    }

    public String save() {
        this.talkRepository.merge(this.currentTalk);
        return "exit";
    }

}
