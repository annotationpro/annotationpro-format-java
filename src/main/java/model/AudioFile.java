package model;

import lombok.Data;

/**
 * Represents audio file object in annotation pro format
 * You use it to hold information about audio files used in annotation.
 *
 * @author  Wojciech Klessa
 * @since   2017-01-10
 */
public @Data class AudioFile {
    String id;
    String name;
    String fileName;
    boolean external;
    boolean current;
}
