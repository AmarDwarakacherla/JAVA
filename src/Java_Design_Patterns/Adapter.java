package Java_Design_Patterns;

interface MediaPlayer {
    void play(String fileName);
}

class MP3Player implements MediaPlayer {
    public void play(String fileName) {
        System.out.println("Playing mp3: " + fileName);
    }
}

class VLCPlayer {
    public void playVLC(String fileName) {
        System.out.println("Playing VLC: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer = new VLCPlayer();

    public void play(String fileName) {
        vlcPlayer.playVLC(fileName);
    }
}

public class Adapter {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("video.vlc");
    }
}
