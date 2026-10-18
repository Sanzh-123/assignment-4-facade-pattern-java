package subsystem;

public class MetadataReader {
    public String read(String fileName) {
        System.out.println("MetadataReader: Reading file metadata for " + fileName + "...");
        return "file_metadata_v1";
    }

    public String extractType(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("MetadataReader: Format identified as ." + extension);
        return extension;
    }
}