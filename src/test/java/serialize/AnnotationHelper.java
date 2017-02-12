package serialize;

import model.Annotation;
import model.Layer;
import model.Segment;

import java.util.Date;

public class AnnotationHelper {
    private final String UUID_LAYER = "ed9dcc21-1dfb-47db-8777-3b5c1131d168";
    private final String UUID_SEGMENT = "ab1c2902-0049-4a2e-8aa4-6413bb78b989";

    public Annotation getModelAnnotation() {
        Annotation annotation = new Annotation(0);
        annotation.getConfiguration().put(Annotation.SAMPLERATE_KEY, "44100");
        annotation.getConfiguration().put(Annotation.VERSION_KEY, "5");
        annotation.getConfiguration().put(Annotation.FILE_VERSION_KEY, "5");
        annotation.getConfiguration().put(Annotation.CREATED_KEY, new Date(2017,01,10).toString());
        annotation.getConfiguration().put(Annotation.MODIFIED_KEY, new Date(2017,01,10).toString());
        annotation.getConfiguration().put(Annotation.PROJECT_TITLE_KEY, "Project 1");
        annotation.getConfiguration().put(Annotation.PROJECT_ENVIRONMENT, "AA");
        annotation.getConfiguration().put(Annotation.PROJECT_NOISES, "23+");
        annotation.getConfiguration().put(Annotation.PROJECT_COLLECTION, "COLL");
        annotation.getConfiguration().put(Annotation.PROJECT_CORPUS_TYPE, "SPEAK");
        annotation.getConfiguration().put(Annotation.PROJECT_CORPUS_OWNER, "KK");
        annotation.getConfiguration().put(Annotation.PROJECT_LICENSE, "PRIV");
        annotation.getConfiguration().put(Annotation.PROJECT_DESCRIPTION, "Description of corpus");

        Layer layer = new Layer("");
        layer.setId(UUID_LAYER);
        layer.setName("Layer 1");
        layer.setForeColor(-3281999);
        layer.setBackColor(-16777216);
        layer.setSelected(true);
        layer.setHeight(40);
        layer.setCoordinateControlStyle(1);
        layer.setLocked(true);
        layer.setClosed(true);
        layer.setShowOnSpectrogram(true);
        layer.setShowAsChart(true);
        layer.setChartMinimum(-10);
        layer.setChartMaximum(500);
        layer.setShowBoundaries(true);
        layer.setIncludeInFrequency(true);
        layer.setParameter1Name("P1");
        layer.setParameter2Name("P2");
        layer.setParameter3Name("P3");
        layer.setVisible(true);
        layer.setFontSize(11);

        annotation.getLayers().add(layer);

        Segment segment = new Segment("",0,0);
        segment.setId(UUID_SEGMENT);
        segment.setForeColor(-16777216);
        segment.setBackColor(-1);
        segment.setBorderColor(-16777216);
        segment.setLabel("This is phrase");
        segment.setStart(12333);
        segment.setDuration(44300);
        segment.setSelected(true);
        segment.setFeature("Feature");
        segment.setLanguage("PL");
        segment.setGroup("---");
        segment.setName("-- na --");
        segment.setParameter1("12");
        segment.setParameter2("32");
        segment.setParameter3("44");
        segment.setMarkerEnabled(false);
        segment.setMarker("marker test");
        segment.setRScript("no");

        layer.getSegments().add(segment);

        return  annotation;
    }

    public String getModelAnnotationXml() {

        return "<?xml version=\"1.0\" standalone=\"yes\"?>\n" +
                "<AnnotationSystemDataSet xmlns=\"http://tempuri.org/AnnotationSystemDataSet.xsd\">\n" +
                "  <Layer>\n" +
                "    <Id>ed9dcc21-1dfb-47db-8777-3b5c1131d168</Id>\n" +
                "    <Name>Layer 1</Name>\n" +
                "    <ForeColor>-3281999</ForeColor>\n" +
                "    <BackColor>-16777216</BackColor>\n" +
                "    <IsSelected>true</IsSelected>\n" +
                "    <Height>40</Height>\n" +
                "    <CoordinateControlStyle>1</CoordinateControlStyle>\n" +
                "    <IsLocked>true</IsLocked>\n" +
                "    <IsClosed>true</IsClosed>\n" +
                "    <ShowOnSpectrogram>true</ShowOnSpectrogram>\n" +
                "    <ShowAsChart>true</ShowAsChart>\n" +
                "    <ChartMinimum>-10</ChartMinimum>\n" +
                "    <ChartMaximum>500</ChartMaximum>\n" +
                "    <ShowBoundaries>true</ShowBoundaries>\n" +
                "    <IncludeInFrequency>true</IncludeInFrequency>\n" +
                "    <Parameter1Name>P1</Parameter1Name>\n" +
                "    <Parameter2Name>P2</Parameter2Name>\n" +
                "    <Parameter3Name>P3</Parameter3Name>\n" +
                "    <IsVisible>true</IsVisible>\n" +
                "    <FontSize>11</FontSize>\n" +
                "  </Layer>\n" +
                "  <Segment>\n" +
                "    <Id>ab1c2902-0049-4a2e-8aa4-6413bb78b989</Id>\n" +
                "    <IdLayer>ed9dcc21-1dfb-47db-8777-3b5c1131d168</IdLayer>\n" +
                "    <Label>This is phrase</Label>\n" +
                "    <ForeColor>-16777216</ForeColor>\n" +
                "    <BackColor>-1</BackColor>\n" +
                "    <BorderColor>-16777216</BorderColor>\n" +
                "    <Start>12333.0</Start>\n" +
                "    <Duration>44300.0</Duration>\n" +
                "    <IsSelected>true</IsSelected>\n" +
                "    <Feature>Feature</Feature>\n" +
                "    <Language>PL</Language>\n" +
                "    <Group>---</Group>\n" +
                "    <Name>-- na --</Name>\n" +
                "    <Parameter1>12</Parameter1>\n" +
                "    <Parameter2>32</Parameter2>\n" +
                "    <Parameter3>44</Parameter3>\n" +
                "    <IsMarker>false</IsMarker>\n" +
                "    <Marker>marker test</Marker>\n" +
                "    <RScript>no</RScript>\n" +
                "  </Segment>\n" +
                "  <Configuration>\n" +
                "    <Key>Modified</Key>\n" +
                "    <Value>Sat Feb 10 00:00:00 CET 3917</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectCorpusOwner</Key>\n" +
                "    <Value>KK</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectLicense</Key>\n" +
                "    <Value>PRIV</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectCorpusType</Key>\n" +
                "    <Value>SPEAK</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>Samplerate</Key>\n" +
                "    <Value>44100</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>Created</Key>\n" +
                "    <Value>Sat Feb 10 00:00:00 CET 3917</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectEnvironment</Key>\n" +
                "    <Value>AA</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectTitle</Key>\n" +
                "    <Value>Project 1</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>Version</Key>\n" +
                "    <Value>5</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>FileVersion</Key>\n" +
                "    <Value>5</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectCollection</Key>\n" +
                "    <Value>COLL</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectNoises</Key>\n" +
                "    <Value>23+</Value>\n" +
                "  </Configuration>\n" +
                "  <Configuration>\n" +
                "    <Key>ProjectDescription</Key>\n" +
                "    <Value>Description of corpus</Value>\n" +
                "  </Configuration>\n" +
                "</AnnotationSystemDataSet>";
    }

}
