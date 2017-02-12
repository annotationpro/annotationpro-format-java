package model;

import java.util.UUID;

/**
 * This class contains all information abour annotation segment.
 * The most important is: start, duration and label
 *
 * @author Wojciech Klessa
 * @since 2017-01-10
 */
public class Segment {

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

    private String id;
    private String idLayer;
    private String label;
    private int foreColor;
    private int backColor;
    private int borderColor;
    private double start;
    private double duration;
    private boolean isSelected;
    private String feature;
    private String language;
    private String group;
    private String name;
    private String parameter1;
    private String parameter2;
    private String parameter3;
    private boolean isMarkerEnabled;
    private String marker;
    private String rScript;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdLayer() {
        return idLayer;
    }

    public void setIdLayer(String idLayer) {
        this.idLayer = idLayer;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getForeColor() {
        return foreColor;
    }

    public void setForeColor(int foreColor) {
        this.foreColor = foreColor;
    }

    public int getBackColor() {
        return backColor;
    }

    public void setBackColor(int backColor) {
        this.backColor = backColor;
    }

    public int getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(int borderColor) {
        this.borderColor = borderColor;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public String getParameter3() {
        return parameter3;
    }

    public void setParameter3(String parameter3) {
        this.parameter3 = parameter3;
    }

    public boolean isMarkerEnabled() {
        return isMarkerEnabled;
    }

    public void setMarkerEnabled(boolean markerEnabled) {
        isMarkerEnabled = markerEnabled;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getRScript() {
        return rScript;
    }

    public void setRScript(String rScript) {
        this.rScript = rScript;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Segment segment = (Segment) o;

        if (foreColor != segment.foreColor) return false;
        if (backColor != segment.backColor) return false;
        if (borderColor != segment.borderColor) return false;
        if (Double.compare(segment.start, start) != 0) return false;
        if (Double.compare(segment.duration, duration) != 0) return false;
        if (isSelected != segment.isSelected) return false;
        if (isMarkerEnabled != segment.isMarkerEnabled) return false;
        if (id != null ? !id.equals(segment.id) : segment.id != null) return false;
        if (idLayer != null ? !idLayer.equals(segment.idLayer) : segment.idLayer != null) return false;
        if (label != null ? !label.equals(segment.label) : segment.label != null) return false;
        if (feature != null ? !feature.equals(segment.feature) : segment.feature != null) return false;
        if (language != null ? !language.equals(segment.language) : segment.language != null) return false;
        if (group != null ? !group.equals(segment.group) : segment.group != null) return false;
        if (name != null ? !name.equals(segment.name) : segment.name != null) return false;
        if (parameter1 != null ? !parameter1.equals(segment.parameter1) : segment.parameter1 != null) return false;
        if (parameter2 != null ? !parameter2.equals(segment.parameter2) : segment.parameter2 != null) return false;
        if (parameter3 != null ? !parameter3.equals(segment.parameter3) : segment.parameter3 != null) return false;
        if (marker != null ? !marker.equals(segment.marker) : segment.marker != null) return false;
        return rScript != null ? rScript.equals(segment.rScript) : segment.rScript == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idLayer != null ? idLayer.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + foreColor;
        result = 31 * result + backColor;
        result = 31 * result + borderColor;
        temp = Double.doubleToLongBits(start);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isSelected ? 1 : 0);
        result = 31 * result + (feature != null ? feature.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (parameter1 != null ? parameter1.hashCode() : 0);
        result = 31 * result + (parameter2 != null ? parameter2.hashCode() : 0);
        result = 31 * result + (parameter3 != null ? parameter3.hashCode() : 0);
        result = 31 * result + (isMarkerEnabled ? 1 : 0);
        result = 31 * result + (marker != null ? marker.hashCode() : 0);
        result = 31 * result + (rScript != null ? rScript.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "label='" + label + '\'' +
                ", start=" + start +
                ", duration=" + duration +
                '}';
    }
}
