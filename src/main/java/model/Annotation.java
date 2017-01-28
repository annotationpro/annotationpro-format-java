package model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
@XmlRootElement(namespace = "AnotationEditorDataSet")
public class Annotation {
    public static final String SAMPLERATE_KEY = "Samplerate";
    public static final String VERSION_KEY = "Version";
    public static final String FILE_VERSION_KEY = "FileVersion";
    public static final String CREATED_KEY = "Created";
    public static final String MODIFIED_KEY = "Modified";

    public static final String PROJECT_TITLE_KEY = "ProjectTitle";
    public static final String PROJECT_ENVIRONMENT = "ProjectEnvironment";
    public static final String PROJECT_NOISES = "ProjectNoises";
    public static final String PROJECT_COLLECTION = "ProjectCollection";
    public static final String PROJECT_CORPUS_TYPE = "ProjectCorpusType";
    public static final String PROJECT_CORPUS_OWNER = "ProjectCorpusOwner";
    public static final String PROJECT_LICENSE = "ProjectLicense";
    public static final String PROJECT_DESCRIPTION = "ProjectDescription";

    public static final String VERSION = "5";

    List<Layer> layers = new ArrayList<Layer>();
    HashMap<String, String> configuration = new HashMap<String, String>();

    public Annotation(Integer samplerate) {
        configuration.put(SAMPLERATE_KEY, samplerate.toString());
        configuration.put(VERSION_KEY, VERSION);
        configuration.put(FILE_VERSION_KEY, VERSION);
        configuration.put(CREATED_KEY, new Date().toString());
        configuration.put(MODIFIED_KEY, new Date().toString());

        configuration.put(PROJECT_TITLE_KEY, "");
        configuration.put(PROJECT_ENVIRONMENT, "");
        configuration.put(PROJECT_NOISES, "");
        configuration.put(PROJECT_COLLECTION, "");
        configuration.put(PROJECT_CORPUS_TYPE, "");
        configuration.put(PROJECT_CORPUS_OWNER, "");
        configuration.put(PROJECT_LICENSE, "");
        configuration.put(PROJECT_DESCRIPTION, "");
    }

}
