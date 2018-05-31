package Metodos;

import Videos.IFVideo;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;

/**
 *
 * @author lucas
 */
public class VideoToVideo {
    public static void convert(String input, String output, IFVideo videoEncoder) throws IllegalArgumentException, EncoderException {
        File source = new File(input);
        File target = new File(output);
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec(videoEncoder.getCodecAudio());
        audio.setBitRate(videoEncoder.getVideo().getAudio().getTaxaBits());
        audio.setChannels(videoEncoder.getVideo().getAudio().getCanais());
        audio.setSamplingRate(videoEncoder.getVideo().getAudio().getSamplingRate());
        VideoAttributes video = new VideoAttributes();
        video.setCodec(videoEncoder.getVideo().getCodecVideo());
        video.setBitRate(videoEncoder.getVideo().getVideoBitRate());
        video.setFrameRate(videoEncoder.getVideo().getVideoFrameRate());
        //video.setSize(new VideoSize(400, 300));
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat(videoEncoder.getVideo().getFormato());
        attrs.setAudioAttributes(audio);
        attrs.setVideoAttributes(video);
        Encoder encoder = new Encoder();
        encoder.encode(source, target, attrs);
    }

}
