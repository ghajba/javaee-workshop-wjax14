package de.gedoplan.workshop.presentation;

import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.domain.TalkType;
import de.gedoplan.workshop.persistence.TalkRepository;

/**
 * @author GHajba 2014 nov. 3
 *
 */
@Named
@FlowScoped(value = "talkEdit")
public class TalkEditPresenter {

    @Inject
    @Current
    private Talk currentTalk;

    @Inject
    TalkRepository talkRepository;

    public Talk getCurrentTalk() {
        return this.currentTalk;
    }

    public String save() {
        this.talkRepository.merge(this.currentTalk);
        return "exit";
    }

    public TalkType[] getTalkTypes() {
        return TalkType.values();
    }

}
