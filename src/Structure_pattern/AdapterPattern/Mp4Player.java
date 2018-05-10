package Structure_pattern.AdapterPattern;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放Mp4文件，名字："+fileName);
    }
}
