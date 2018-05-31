/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videos;

import Objetos.Video;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class FormatoAVI implements IFVideo {
    
    private Video video;
    private ArrayList<String> codecsVideo; 
    private String codecAudio;

    public FormatoAVI() {
        codecsVideo = new ArrayList<>();
        codecsVideo.add("mpeg4");
        codecsVideo.add("libxvid");
        this.codecAudio = "libmp3lame";
    }

    @Override
    public Video getVideo() {
        return video;
    }

    @Override
    public void setVideo(Video video) {
        this.video = video;
    }
    
    @Override
    public ArrayList<String> getCodecsVideo() {
        return codecsVideo;
    }

    public void setCodecsVideo(ArrayList<String> codecsVideo) {
        this.codecsVideo = codecsVideo;
    }
    
    @Override
    public String getCodecAudio() {
        return codecAudio;
    }

    public void setCodecAudio(String codecAudio) {
        this.codecAudio = codecAudio;
    }
    
}
