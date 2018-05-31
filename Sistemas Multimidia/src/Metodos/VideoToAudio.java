package Metodos;

import Objetos.Audio;
import java.io.File;
import java.io.IOException;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;


public class VideoToAudio {
    
    public static void convertToAudio(Audio sound, String input, String output) throws IllegalArgumentException, InputFormatException, EncoderException, IOException {
        File video= new File(input);
        File target = new File(output);
        AudioAttributes audio = new AudioAttributes();
        audio.setBitRate(sound.getTaxaBits());
        audio.setChannels(sound.getCanais());
        audio.setSamplingRate(sound.getSamplingRate());
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat(sound.getFormato());
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        encoder.encode(video, target, attrs);

    }
}
