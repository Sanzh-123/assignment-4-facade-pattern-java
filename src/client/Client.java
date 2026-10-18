package client;

import facade.MediaConversionFacade;

public class Client {
    public static void main(String[] args) {
        // The client only interacts with the Facade. 
        // It never instantiates or calls MetadataReader, CodecFactory, BitrateReader, or AudioMixer directly.
        MediaConversionFacade converter = new MediaConversionFacade();
        
        String result = converter.convertVideo("funny_cats.ogg", "mp4");
        System.out.println("Client successfully received output file: " + result);
    }
}