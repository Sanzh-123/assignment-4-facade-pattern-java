package subsystem;

public class CodecFactory {
    public Object extract(String fileType, String targetFormat) {
        System.out.println("CodecFactory: Extracting codec for source type '" + fileType + "' to target '" + targetFormat + "'...");
        if (targetFormat.equalsIgnoreCase("mp4")) {
            return "H264Codec";
        } else {
            return "OggAudioCodec";
        }
    }
}