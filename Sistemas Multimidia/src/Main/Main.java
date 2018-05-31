/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Metodos.VideoToVideo;
import Objetos.Audio;
import Objetos.Video;
import Videos.Formato3GP;
import Videos.IFVideo;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class Main {
    
    
    public static void main (String args[]) throws IllegalArgumentException, EncoderException, IOException{
        // audio libmp3lame, libfaac
        // video mpeg1video mpeg2video mpeg4 libxvid
        Audio audio = new Audio(
                "", 
                224000, 
                2, 
                44100, 
                "mp2");
        Video video = new Video(
                audio, 
                200000, 
                25, 
                "mpeg", 
                2, 
                "mpeg1video");
        
        IFVideo format = new Formato3GP();
        format.setVideo(video);
        String input = "C:\\Users\\lucas\\Desktop\\mp4.mp4";
        String output = "C:/Users\\lucas\\Desktop\\teste.wmv";
        //VideoToVideo.convert(input, output, format);
        Runtime.getRuntime().exec("cmd /c ffmpeg.exe -i \"" + input + "\" -y \"" + output + "\"");


    }
    
    
}
