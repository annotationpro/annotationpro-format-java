package serialize;

import model.Annotation;
import model.Layer;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnnotationDeserializerTest {

    AnnotationHelper annotationHelper = new AnnotationHelper();

    @Test
    public void deserializeAnnotation() throws Exception {
        // deserialize from xml
        AnnotationDeserializer deserializer = new AnnotationDeserializer();
        Annotation annotation = deserializer.deserializeAnnotation(annotationHelper.getModelAnnotationXml());

        // serialize again
        AnnotationSerializer serializer = new AnnotationSerializer();
        String xml = serializer.serializeAnnotation(annotation);

        // compare xmls
        assertEquals(xml, annotationHelper.getModelAnnotationXml());
    }
}