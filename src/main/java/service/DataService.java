package service;

import model.Annotation;
import model.Layer;
import model.Segment;

import java.util.HashMap;
import java.util.Map;

public class DataService {
    public String serializeAnnotation(Annotation annotation) {
        StringBuilder xmlContent = new StringBuilder();
        StringBuilder segmentsContent = new StringBuilder();

        xmlContent.append(createAnnotationHeader());

        // layers and segments
        for (Layer layer : annotation.getLayers()) {
            xmlContent.append(serializeLayer(layer));
            for (Segment segment : layer.getSegments()) {
                segmentsContent.append(serializeSegment(segment));
            }
        }
        xmlContent.append(segmentsContent.toString());

        // configuration items
        xmlContent.append(serializeConfiguration(annotation.getConfiguration()));

        xmlContent.append(createAnnotationFooter());

        return xmlContent.toString();
    }

    private String serializeSegment(Segment segment) {

        String template = "  <Segment>\n" +
                "    <Id>%s</Id>\n" +
                "    <IdLayer>%s</IdLayer>\n" +
                "    <Label>%s</Label>\n" +
                "    <ForeColor>%s</ForeColor>\n" +
                "    <BackColor>%s</BackColor>\n" +
                "    <BorderColor>%s</BorderColor>\n" +
                "    <Start>%s</Start>\n" +
                "    <Duration>%s</Duration>\n" +
                "    <IsSelected>%s</IsSelected>\n" +
                "    <Feature>%s</Feature>\n" +
                "    <Language>%s</Language>\n" +
                "    <Group>%s</Group>\n" +
                "    <Name>%s</Name>\n" +
                "    <Parameter1>%s</Parameter1>\n" +
                "    <Parameter2>%s</Parameter2>\n" +
                "    <Parameter3>%s</Parameter3>\n" +
                "    <IsMarker>%s</IsMarker>\n" +
                "    <Marker>%s</Marker>\n" +
                "    <RScript>%s</RScript>\n" +
                "  </Segment>\n";

        return String.format(template,
                segment.getId(),
                segment.getIdLayer(),
                segment.getLabel(),
                segment.getForeColor(),
                segment.getBackColor(),
                segment.getBorderColor(),
                segment.getStart(),
                segment.getDuration(),
                segment.isSelected(),
                segment.getFeature(),
                segment.getLanguage(),
                segment.getGroup(),
                segment.getName(),
                segment.getParameter1(),
                segment.getParameter2(),
                segment.getParameter3(),
                segment.isMarkerEnabled(),
                segment.getMarker(),
                segment.getRScript()
        );
    }

    private String serializeLayer(Layer layer) {

        String template = "  <Layer>\n" +
                "    <Id>%s</Id>\n" +
                "    <Name>%s</Name>\n" +
                "    <ForeColor>%s</ForeColor>\n" +
                "    <BackColor>%s</BackColor>\n" +
                "    <IsSelected>%s</IsSelected>\n" +
                "    <Height>%s</Height>\n" +
                "    <CoordinateControlStyle>%s</CoordinateControlStyle>\n" +
                "    <IsLocked>%s</IsLocked>\n" +
                "    <IsClosed>%s</IsClosed>\n" +
                "    <ShowOnSpectrogram>%s</ShowOnSpectrogram>\n" +
                "    <ShowAsChart>%s</ShowAsChart>\n" +
                "    <ChartMinimum>%s</ChartMinimum>\n" +
                "    <ChartMaximum>%s</ChartMaximum>\n" +
                "    <ShowBoundaries>%s</ShowBoundaries>\n" +
                "    <IncludeInFrequency>%s</IncludeInFrequency>\n" +
                "    <Parameter1Name>%s</Parameter1Name>\n" +
                "    <Parameter2Name>%s</Parameter2Name>\n" +
                "    <Parameter3Name>%s</Parameter3Name>\n" +
                "    <IsVisible>%s</IsVisible>\n" +
                "    <FontSize>%s</FontSize>\n" +
                "  </Layer>\n";

        return String.format(template,
                layer.getId(),
                layer.getName(),
                layer.getForeColor(),
                layer.getBackColor(),
                layer.isSelected(),
                layer.getHeight(),
                layer.getCoordinateControlStyle(),
                layer.isLocked(),
                layer.isClosed(),
                layer.isShowOnSpectrogram(),
                layer.isShowAsChart(),
                layer.getChartMinimum(),
                layer.getChartMaximum(),
                layer.isShowBoundaries(),
                layer.isIncludeInFrequency(),
                layer.getParameter1Name(),
                layer.getParameter2Name(),
                layer.getParameter3Name(),
                layer.isVisible(),
                layer.getFontSize()
        );
    }

    private String serializeConfiguration(HashMap<String, String> configuration) {

        String template = "  <Configuration>\n" +
                "    <Key>%s</Key>\n" +
                "    <Value>%s</Value>\n" +
                "  </Configuration>\n";

        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, String> entry : configuration.entrySet()) {
            builder.append(String.format(template,
                    entry.getKey(),
                    entry.getValue())
            );
        }

        return builder.toString();
    }

    private String createAnnotationHeader() {
        return "<?xml version=\"1.0\" standalone=\"yes\"?>\n" +
                "<AnnotationSystemDataSet xmlns=\"http://tempuri.org/AnnotationSystemDataSet.xsd\">\n";
    }

    private String createAnnotationFooter() {
        return "</AnnotationSystemDataSet>";
    }
}
