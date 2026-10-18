package facade;

import subsystem.AudioMixer;
import subsystem.BitrateReader;
import subsystem.CodecFactory;
import subsystem.MetadataReader;

public class MediaConversionFacade {
    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        this.metadataReader = new MetadataReader();
        this.codecFactory = new CodecFactory();
        this.bitrateReader = new BitrateReader();
        this.audioMixer = new AudioMixer();
    }

    /**
     * Simplified unified method that hides complex subsystem coordination.
     */
    public String convertVideo(String fileName, String targetFormat) {
        System.out.println("---> MediaConversionFacade: Conversion process started for: " + fileName + " to " + targetFormat + " <---");
        
        String fileType = metadataReader.extractType(fileName);
        metadataReader.read(fileName);
        
        Object sourceCodec = codecFactory.extract(fileType, targetFormat);
        String buffer = bitrateReader.read(fileName, sourceCodec.toString());
        String intermediateResult = bitrateReader.convert(buffer, sourceCodec);
        
        String finalResult = audioMixer.fix(intermediateResult);
        
        System.out.println("---> Conversion completed successfully: " + finalResult + " <---");
        return finalResult;
    }
}