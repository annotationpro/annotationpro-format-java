# annotationpro-format-java
Java library to save annotation in Annotation Pro format.

# Write annotation example 

```Java
        // annotation model
        Annotation annotation = new Annotation(44100);

        // new layer
        Layer layer = new Layer("Example layer");
        layer.setFontSize(12);
        annotation.getLayers().add(layer);

        // new segments
        Segment segment = new Segment("word", 100, 44100);
        layer.getSegments().add(segment);

        Segment segment2 = new Segment("phrase", 52000, 44100);
        layer.getSegments().add(segment2);

        // serialization
        AnnotationSerializer annotationSerializer = new AnnotationSerializer();
        String antxContent = annotationSerializer.serializeAnnotation(annotation);

        // save to file
        try {
            Path file = Paths.get("c:\\annotation new.antx");
            Files.write(file, antxContent.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

```
# Read annotation example

```Java
try {
    // read from file
    Path file = Paths.get("c:\\annotation new.antx");
    String xmlContent = new String(Files.readAllBytes(file));

    // deserialize annotation
    AnnotationDeserializer annotationDeserializer = new AnnotationDeserializer();
    Annotation annotation = annotationDeserializer.deserializeAnnotation(xmlContent);

    // get first layer and first segment on this layer
    Layer layer = annotation.getLayers().get(0);
    Segment segment = layer.getSegments().get(0);

} catch (Exception e) {
    e.printStackTrace();
}
```
