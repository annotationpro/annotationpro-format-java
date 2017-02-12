package model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * This class is model class to hold annotation in annotation PRO format.
 * It containts configuration collection and layers collection
 * Each layer contains segment collection.
 * This is the basis of Annotation PRO format. Its divided into two main parts:
 * layers and segments. Annotation class holds all together.
 *
 * @author Wojciech Klessa
 * @since 2017-01-10
 */
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

    /**
     * Contains all annotation layers in annotation file
     */
    private List<Layer> layers = new ArrayList<Layer>();

    /**
     * The current layers in annotation
     *
     * @return The current layers in annotation
     */
    public List<Layer> getLayers() {
        return layers;
    }

    /**
     * Sets annotation layers
     *
     * @param layers Layers with annotation
     */
    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    /**
     * Contains all configurations enntry in HashMap collection
     */
    private HashMap<String, String> configuration = new HashMap<String, String>();

    /**
     * Configuration entries
     *
     * @return The current configuration entries
     */
    public HashMap<String, String> getConfiguration() {
        return configuration;
    }

    /**
     * Sets new configuration entries
     *
     * @param configuration Configuration entries
     */
    public void setConfiguration(HashMap<String, String> configuration) {
        this.configuration = configuration;
    }

    /**
     * Constructor of annotation class
     * It needs to initialize with samplerate, to work correctly
     *
     * @param samplerate Samplerate for all annotation ex: 44100
     */
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
