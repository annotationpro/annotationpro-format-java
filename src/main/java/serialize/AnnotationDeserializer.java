package serialize;

import model.Annotation;
import model.Configuration;
import model.Layer;
import model.Segment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnnotationDeserializer {
    public Annotation deserializeAnnotation(String xmlContent) throws ParserConfigurationException, SAXException, IOException {
        // xml tools
        DocumentBuilderFactory xmlFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder xmlBuilder = xmlFactory.newDocumentBuilder();
        Document xmlDocument = xmlBuilder.parse(new ByteArrayInputStream(xmlContent.getBytes()));

        // deserialize annotation
        Annotation annotation = new Annotation(44100);
        annotation.setLayers(deserializeLayers(xmlDocument));
        annotation.setConfiguration(deserializeConfiguration(xmlDocument));

        // deserialize segments and insert into layers
        List<Segment> segments = deserializeSegments(xmlDocument);
        insertSegmentsIntoLayers(annotation.getLayers(), segments);

        return annotation;
    }

    private void insertSegmentsIntoLayers(List<Layer> layers, List<Segment> segments) {
        for (Layer layer : layers) {
            for (Segment segment : segments) {
                if(segment.getIdLayer().equals(layer.getId())){
                    layer.getSegments().add(segment);
                }
            }
        }
    }

    private List<Segment> deserializeSegments(Document xmlDocument) {
        List<Segment> segments = new ArrayList<Segment>();

        NodeList nodes = xmlDocument.getElementsByTagName("Segment");
        for (int nodeIndex = 0; nodeIndex < nodes.getLength(); nodeIndex++) {
            Node node = nodes.item(nodeIndex);
            segments.add(deserializeSegment(node));
        }

        return segments;
    }

    private Segment deserializeSegment(Node node) {
        Element element = (Element) node;

        Segment segment = new Segment("", 0, 0);
        segment.setId(element.getElementsByTagName("Id").item(0).getTextContent());
        segment.setIdLayer(element.getElementsByTagName("IdLayer").item(0).getTextContent());
        segment.setLabel(element.getElementsByTagName("Label").item(0).getTextContent());
        segment.setForeColor(Integer.parseInt(element.getElementsByTagName("ForeColor").item(0).getTextContent()));
        segment.setBackColor(Integer.parseInt(element.getElementsByTagName("BackColor").item(0).getTextContent()));
        segment.setBorderColor(Integer.parseInt(element.getElementsByTagName("BorderColor").item(0).getTextContent()));
        segment.setStart(Double.parseDouble(element.getElementsByTagName("Start").item(0).getTextContent()));
        segment.setDuration(Double.parseDouble(element.getElementsByTagName("Duration").item(0).getTextContent()));
        segment.setSelected(Boolean.parseBoolean(element.getElementsByTagName("IsSelected").item(0).getTextContent()));
        segment.setFeature(element.getElementsByTagName("Feature").item(0).getTextContent());
        segment.setLanguage(element.getElementsByTagName("Language").item(0).getTextContent());
        segment.setGroup(element.getElementsByTagName("Group").item(0).getTextContent());
        segment.setName(element.getElementsByTagName("Name").item(0).getTextContent());
        segment.setParameter1(element.getElementsByTagName("Parameter1").item(0).getTextContent());
        segment.setParameter2(element.getElementsByTagName("Parameter2").item(0).getTextContent());
        segment.setParameter3(element.getElementsByTagName("Parameter3").item(0).getTextContent());
        segment.setMarkerEnabled(Boolean.parseBoolean(element.getElementsByTagName("IsMarker").item(0).getTextContent()));
        segment.setMarker(element.getElementsByTagName("Marker").item(0).getTextContent());
        segment.setRScript(element.getElementsByTagName("RScript").item(0).getTextContent());

        return segment;
    }

    private HashMap<String, String> deserializeConfiguration(Document xmlDocument) {
        HashMap<String, String> configuration = new HashMap<String, String>();

        NodeList nodes = xmlDocument.getElementsByTagName("Configuration");
        for (int nodeIndex = 0; nodeIndex < nodes.getLength(); nodeIndex++) {
            Node node = nodes.item(nodeIndex);
            Configuration item = deserializeConfigurationItem(node);
            configuration.put(item.getKey(), item.getValue());
        }

        return configuration;
    }

    private Configuration deserializeConfigurationItem(Node node) {

        Element element = (Element) node;
        String key = element.getElementsByTagName("Key").item(0).getTextContent();
        String value = element.getElementsByTagName("Value").item(0).getTextContent();

        return new Configuration(key, value);
    }

    private List<Layer> deserializeLayers(Document xmlDocument) {
        List<Layer> layers = new ArrayList<Layer>();

        NodeList nodes = xmlDocument.getElementsByTagName("Layer");
        for (int nodeIndex = 0; nodeIndex < nodes.getLength(); nodeIndex++) {
            Node node = nodes.item(nodeIndex);
            layers.add(deserializeLayer(node));
        }

        return layers;
    }

    private Layer deserializeLayer(Node node) {
        Element element = (Element) node;

        Layer layer = new Layer("");
        layer.setId(element.getElementsByTagName("Id").item(0).getTextContent());
        layer.setName(element.getElementsByTagName("Name").item(0).getTextContent());
        layer.setForeColor(Integer.parseInt(element.getElementsByTagName("ForeColor").item(0).getTextContent()));
        layer.setBackColor(Integer.parseInt(element.getElementsByTagName("BackColor").item(0).getTextContent()));
        layer.setSelected(Boolean.parseBoolean(element.getElementsByTagName("IsSelected").item(0).getTextContent()));
        layer.setHeight(Integer.parseInt(element.getElementsByTagName("Height").item(0).getTextContent()));
        layer.setCoordinateControlStyle(Integer.parseInt(element.getElementsByTagName("CoordinateControlStyle").item(0).getTextContent()));
        layer.setLocked(Boolean.parseBoolean(element.getElementsByTagName("IsLocked").item(0).getTextContent()));
        layer.setClosed(Boolean.parseBoolean(element.getElementsByTagName("IsClosed").item(0).getTextContent()));
        layer.setShowOnSpectrogram(Boolean.parseBoolean(element.getElementsByTagName("ShowOnSpectrogram").item(0).getTextContent()));
        layer.setShowAsChart(Boolean.parseBoolean(element.getElementsByTagName("ShowAsChart").item(0).getTextContent()));
        layer.setChartMinimum(Integer.parseInt(element.getElementsByTagName("ChartMinimum").item(0).getTextContent()));
        layer.setChartMaximum(Integer.parseInt(element.getElementsByTagName("ChartMaximum").item(0).getTextContent()));
        layer.setShowBoundaries(Boolean.parseBoolean(element.getElementsByTagName("ShowBoundaries").item(0).getTextContent()));
        layer.setIncludeInFrequency(Boolean.parseBoolean(element.getElementsByTagName("IncludeInFrequency").item(0).getTextContent()));
        layer.setParameter1Name(element.getElementsByTagName("Parameter1Name").item(0).getTextContent());
        layer.setParameter2Name(element.getElementsByTagName("Parameter2Name").item(0).getTextContent());
        layer.setParameter3Name(element.getElementsByTagName("Parameter3Name").item(0).getTextContent());
        layer.setVisible(Boolean.parseBoolean(element.getElementsByTagName("IsVisible").item(0).getTextContent()));
        layer.setFontSize(Integer.parseInt(element.getElementsByTagName("FontSize").item(0).getTextContent()));

        return layer;
    }
}
