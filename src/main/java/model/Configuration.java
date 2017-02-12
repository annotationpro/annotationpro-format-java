package model;

import java.util.Map;

/**
 * Configuration HashMap based class to holde configuration entries
 * It should be placed in Annotation class, to holds all configurations
 * For annotation
 *
 * @author Wojciech Klessa
 * @since 2017-01-10
 */
public class Configuration implements Map.Entry<String, String> {
    private final String key;
    private String value;

    public Configuration(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String setValue(String value) {
        String old = this.value;
        this.value = value;
        return old;
    }
}