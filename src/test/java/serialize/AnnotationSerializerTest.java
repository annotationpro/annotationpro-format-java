package serialize;

import model.Annotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnnotationSerializerTest {

    AnnotationHelper annotationHelper = new AnnotationHelper();

    @Test
    public void serializeAnnotation() throws Exception {
        Annotation annotation = annotationHelper.getModelAnnotation();
        AnnotationSerializer serializer = new AnnotationSerializer();
        String xmlContent = serializer.serializeAnnotation(annotation);

        assertEquals(xmlContent, annotationHelper.getModelAnnotationXml());
    }

}