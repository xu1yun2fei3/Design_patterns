package Structure_pattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }

    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer=new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer=new Mp4Player();
        }
        }
    }



