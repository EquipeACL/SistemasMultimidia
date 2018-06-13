/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author lucas
 */
public class Video {
    
    private Audio audio;
    private int videoBitRate;
    private int videoFrameRate;
    private String formato;
    private int canais;
    private String codecVideo;
    private Integer[] resolucao = new Integer[]{};

    public Video(Audio audio, int videoBitRate, int videoFrameRate, String formato, int canais, String codecVideo) {
        this.audio = audio;
        this.videoBitRate = videoBitRate;
        this.videoFrameRate = videoFrameRate;
        this.formato = formato;
        this.canais = canais;
        this.codecVideo = codecVideo;
    }

   
    public Video() {
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public int getVideoBitRate() {
        return videoBitRate;
    }

    public void setVideoBitRate(int videoBitRate) {
        this.videoBitRate = videoBitRate;
    }

    public int getVideoFrameRate() {
        return videoFrameRate;
    }

    public void setVideoFrameRate(int videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public String getFormato() {
        return formato;
    }

    public String getCodecVideo() {
        return codecVideo;
    }

    public void setCodecVideo(String codecVideo) {
        this.codecVideo = codecVideo;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }
 
    public void setResolucao(Integer[] resolucao){
        this.resolucao = resolucao;
    }
    
    public Integer[] getResolucao(){
        return this.resolucao;
    }
}
