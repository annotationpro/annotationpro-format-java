package model;

import java.util.ArrayList;

public class SegmentCollection extends ArrayList<Segment> {

    private String idLayer;

    public SegmentCollection(String idLayer) {
        this.idLayer = idLayer;
    }

    public String getIdLayer() {
        return idLayer;
    }

    public void setIdLayer(String idLayer) {
        this.idLayer = idLayer;
    }

    @Override
    public boolean add(Segment segment) {
        segment.setIdLayer(idLayer);
        return super.add(segment);
    }

    @Override
    public void add(int index, Segment element) {
        element.setIdLayer(idLayer);
        super.add(index, element);
    }
}
