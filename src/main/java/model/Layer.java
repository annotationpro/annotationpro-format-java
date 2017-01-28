package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Layer {
    public Layer(String name) {
        setId(UUID.randomUUID().toString());
        setName(name);
        setForeColor(-16777216);
        setBackColor(-3281999);
        setSelected(true);
        setHeight(70);
        setCoordinateControlStyle(3);
        setLocked(false);
        setClosed(false);
        setShowOnSpectrogram(false);
        setShowAsChart(false);
        setChartMinimum(-50);
        setChartMaximum(50);
        setShowBoundaries(true);
        setIncludeInFrequency(true);
        setParameter1Name("Parameter 1");
        setParameter2Name("Parameter 2");
        setParameter3Name("Parameter 3");
        setVisible(true);
        setFontSize(10);
    }

    String id;
    String name;
    int foreColor;
    int backColor;
    boolean isSelected;
    int height;
    int coordinateControlStyle;
    boolean isLocked;
    boolean isClosed;
    boolean showOnSpectrogram;
    boolean showAsChart;
    int chartMinimum;
    int chartMaximum;
    boolean showBoundaries;
    boolean includeInFrequency;
    String parameter1Name;
    String parameter2Name;
    String parameter3Name;
    boolean isVisible;
    int fontSize;

    List<Segment> segments = new ArrayList<Segment>();
}

