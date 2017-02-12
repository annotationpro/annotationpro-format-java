package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Class with annotation layer. The most important is collection of segments, which contains segments for
 * this layer.
 *
 * @author Wojciech Klessa
 * @since 2017-01-10
 */
public class Layer {
    public Layer(String name) {
        String id = UUID.randomUUID().toString();
        segments = new SegmentCollection(id);

        setId(id);
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

    private String id;
    private String name;
    private int foreColor;
    private int backColor;
    private boolean isSelected;
    private int height;
    private int coordinateControlStyle;
    private boolean isLocked;
    private boolean isClosed;
    private boolean showOnSpectrogram;
    private boolean showAsChart;
    private int chartMinimum;
    private int chartMaximum;
    private boolean showBoundaries;
    private boolean includeInFrequency;
    private String parameter1Name;
    private String parameter2Name;
    private String parameter3Name;
    private boolean isVisible;
    private int fontSize;

    private SegmentCollection segments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        getSegments().setIdLayer(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoordinateControlStyle() {
        return coordinateControlStyle;
    }

    public void setCoordinateControlStyle(int coordinateControlStyle) {
        this.coordinateControlStyle = coordinateControlStyle;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isShowOnSpectrogram() {
        return showOnSpectrogram;
    }

    public void setShowOnSpectrogram(boolean showOnSpectrogram) {
        this.showOnSpectrogram = showOnSpectrogram;
    }

    public boolean isShowAsChart() {
        return showAsChart;
    }

    public void setShowAsChart(boolean showAsChart) {
        this.showAsChart = showAsChart;
    }

    public int getChartMinimum() {
        return chartMinimum;
    }

    public void setChartMinimum(int chartMinimum) {
        this.chartMinimum = chartMinimum;
    }

    public int getChartMaximum() {
        return chartMaximum;
    }

    public void setChartMaximum(int chartMaximum) {
        this.chartMaximum = chartMaximum;
    }

    public boolean isShowBoundaries() {
        return showBoundaries;
    }

    public void setShowBoundaries(boolean showBoundaries) {
        this.showBoundaries = showBoundaries;
    }

    public boolean isIncludeInFrequency() {
        return includeInFrequency;
    }

    public void setIncludeInFrequency(boolean includeInFrequency) {
        this.includeInFrequency = includeInFrequency;
    }

    public String getParameter1Name() {
        return parameter1Name;
    }

    public void setParameter1Name(String parameter1Name) {
        this.parameter1Name = parameter1Name;
    }

    public String getParameter2Name() {
        return parameter2Name;
    }

    public void setParameter2Name(String parameter2Name) {
        this.parameter2Name = parameter2Name;
    }

    public String getParameter3Name() {
        return parameter3Name;
    }

    public void setParameter3Name(String parameter3Name) {
        this.parameter3Name = parameter3Name;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public SegmentCollection getSegments() {
        return segments;
    }

    public void setSegments(SegmentCollection segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Layer layer = (Layer) o;

        if (foreColor != layer.foreColor) return false;
        if (backColor != layer.backColor) return false;
        if (isSelected != layer.isSelected) return false;
        if (height != layer.height) return false;
        if (coordinateControlStyle != layer.coordinateControlStyle) return false;
        if (isLocked != layer.isLocked) return false;
        if (isClosed != layer.isClosed) return false;
        if (showOnSpectrogram != layer.showOnSpectrogram) return false;
        if (showAsChart != layer.showAsChart) return false;
        if (chartMinimum != layer.chartMinimum) return false;
        if (chartMaximum != layer.chartMaximum) return false;
        if (showBoundaries != layer.showBoundaries) return false;
        if (includeInFrequency != layer.includeInFrequency) return false;
        if (isVisible != layer.isVisible) return false;
        if (fontSize != layer.fontSize) return false;
        if (!id.equals(layer.id)) return false;
        if (name != null ? !name.equals(layer.name) : layer.name != null) return false;
        if (parameter1Name != null ? !parameter1Name.equals(layer.parameter1Name) : layer.parameter1Name != null)
            return false;
        if (parameter2Name != null ? !parameter2Name.equals(layer.parameter2Name) : layer.parameter2Name != null)
            return false;
        if (parameter3Name != null ? !parameter3Name.equals(layer.parameter3Name) : layer.parameter3Name != null)
            return false;
        return segments.equals(layer.segments);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + foreColor;
        result = 31 * result + backColor;
        result = 31 * result + (isSelected ? 1 : 0);
        result = 31 * result + height;
        result = 31 * result + coordinateControlStyle;
        result = 31 * result + (isLocked ? 1 : 0);
        result = 31 * result + (isClosed ? 1 : 0);
        result = 31 * result + (showOnSpectrogram ? 1 : 0);
        result = 31 * result + (showAsChart ? 1 : 0);
        result = 31 * result + chartMinimum;
        result = 31 * result + chartMaximum;
        result = 31 * result + (showBoundaries ? 1 : 0);
        result = 31 * result + (includeInFrequency ? 1 : 0);
        result = 31 * result + (parameter1Name != null ? parameter1Name.hashCode() : 0);
        result = 31 * result + (parameter2Name != null ? parameter2Name.hashCode() : 0);
        result = 31 * result + (parameter3Name != null ? parameter3Name.hashCode() : 0);
        result = 31 * result + (isVisible ? 1 : 0);
        result = 31 * result + fontSize;
        result = 31 * result + segments.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Layer{" +
                "name='" + name + '\'' +
                '}';
    }
}

