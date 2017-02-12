package model;

import lombok.Data;

import java.util.UUID;

/**
 * This class contains all information abour annotation segment.
 * The most important is: start, duration and label
 *
 * @author Wojciech Klessa
 * @since 2017-01-10
 */
public @Data class Segment {

    public Segment(String label, double start, double duration) {
        setId(UUID.randomUUID().toString());
        setForeColor(-16777216);
        setBackColor(-1);
        setBorderColor(-16777216);
        setLabel(label);
        setStart(start);
        setDuration(duration);
        setSelected(false);
        setFeature("");
        setLanguage("");
        setGroup("");
        setName("");
        setParameter1("");
        setParameter2("");
        setParameter3("");
        setMarkerEnabled(false);
        setMarker("");
        setRScript("");
    }

    String id;
    String idLayer;
    String label;
    int foreColor;
    int backColor;
    int borderColor;
    double start;
    double duration;
    boolean isSelected;
    String feature;
    String language;
    String group;
    String name;
    String parameter1;
    String parameter2;
    String parameter3;
    boolean isMarkerEnabled;
    String marker;
    String rScript;
}
