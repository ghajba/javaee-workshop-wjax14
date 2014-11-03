package de.gedoplan.workshop.persistence;

import javax.persistence.AttributeConverter;

import de.gedoplan.workshop.domain.TalkType;

/**
 * @author GHajba 2014 nov. 3
 *
 */
public class TalkTypeConverter implements AttributeConverter<TalkType, String> {

    @Override
    public String convertToDatabaseColumn(TalkType attribute) {

        if (attribute == null) {
            return null;
        }
        switch (attribute) {
        case KEYNOTE:
            return "K";
        case SESSION:
            return "S";
        case WORKSHOP:
            return "W";
        default:
            throw new IllegalArgumentException("Unknown TalkType: " + attribute);
        }
    }

    @Override
    public TalkType convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }

        switch (dbData) {
        case "K":
            return TalkType.KEYNOTE;
        case "S":
            return TalkType.SESSION;
        case "W":
            return TalkType.WORKSHOP;
        default:
            throw new IllegalArgumentException("Unknown TalkType: " + dbData);
        }
    }

}
