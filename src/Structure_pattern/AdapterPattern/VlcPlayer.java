package Structure_pattern.AdapterPattern;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放格式为Vlc的文件，名字："+fileName);


    }
}
