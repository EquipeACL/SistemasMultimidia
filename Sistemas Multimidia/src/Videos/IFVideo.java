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
public interface IFVideo {
    
    public Video getVideo();
    public ArrayList<String> getCodecsVideo();
    public String getCodecAudio();
    public void setVideo(Video video);
    
}
