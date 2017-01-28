# annotationpro-format-java
Java library to save annotation in Annotation Pro format.

# Simple usage example 

```Java
// annotation model
Annotation annotation = new Annotation(44100);

// new layer
Layer layer = new Layer("Example layer");
layer.setFontSize(12);
annotation.getLayers().add(layer);

// new segment
Segment segment = new Segment("word", 100, 44100);
segment.setIdLayer(layer.getId());
layer.getSegments().add(segment);

Segment segment2 = new Segment("phrase", 52000, 44100);
segment2.setIdLayer(layer.getId());
layer.getSegments().add(segment2);

// serialization
DataService dataService = new DataService();
String antxContent = dataService.serializeAnnotation(annotation);

// save to file
try {
    Path file = Paths.get("c:\\annotation new.antx");
    Files.write(file, antxContent.getBytes());
} catch (IOException e) {
    e.printStackTrace();
}
```
