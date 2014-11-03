package de.gedoplan.workshop.domain;

//import de.gedoplan.workshop.persistence.TalkTypeConverter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Talk extends GeneratedIntegerIdEntity {

    private String title;

    @ElementCollection(fetch = FetchType.EAGER)
    @OrderColumn
    private List<String> speakers;

    // @Enumerated(EnumType.STRING)
    // @Convert(converter = TalkTypeConverter.class)
    private TalkType talkType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date start;

    @Temporal(TemporalType.TIME)
    private Date duration;

    @ManyToOne
    private SpecialDay specialDay;

    protected Talk() {

    }

    public Talk(String title, TalkType talkType, Date start, Date duration, String... speakers) {
        this.title = title;
        this.talkType = talkType;
        this.start = start;
        this.duration = duration;
        this.speakers = new ArrayList<>();
        for (final String speaker : speakers) {
            this.speakers.add(speaker);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getSpeakers() {
        return this.speakers;
    }

    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    public TalkType getTalkType() {
        return this.talkType;
    }

    public void setTalkType(TalkType talkType) {
        this.talkType = talkType;
    }

    public Date getStart() {
        return this.start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDuration() {
        return this.duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public SpecialDay getSpecialDay() {
        return this.specialDay;
    }

    public void setSpecialDay(SpecialDay specialDay) {
        this.specialDay = specialDay;
    }

    public String getSpeakersAsCommaSeparatedList() {
        final StringBuilder sb = new StringBuilder();
        for (final String speaker : this.speakers) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(speaker);
        }

        return sb.toString();
    }

    public void setSpeakersAsCommaSeparatedList(String cs) {
        this.speakers.clear();
        for (final String speaker : cs.split("\\s*,\\s*")) {
            this.speakers.add(speaker);
        }
    }
}
