package model;

/**
 * Represents audio file object in annotation pro format
 * You use it to hold information about audio files used in annotation.
 *
 * @author  Wojciech Klessa
 * @since   2017-01-10
 */
public class AudioFile {
    private String id;
    private String name;
    private String fileName;
    private boolean external;
    private boolean current;

    public AudioFile(String name, String fileName, boolean external, boolean current) {
        this.name = name;
        this.fileName = fileName;
        this.external = external;
        this.current = current;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AudioFile audioFile = (AudioFile) o;

        if (external != audioFile.external) return false;
        if (current != audioFile.current) return false;
        if (id != null ? !id.equals(audioFile.id) : audioFile.id != null) return false;
        if (name != null ? !name.equals(audioFile.name) : audioFile.name != null) return false;
        return fileName != null ? fileName.equals(audioFile.fileName) : audioFile.fileName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (external ? 1 : 0);
        result = 31 * result + (current ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AudioFile{" +
                "name='" + name + '\'' +
                ", fileName='" + fileName + '\'' +
                ", external=" + external +
                ", current=" + current +
                '}';
    }
}
