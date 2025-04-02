package oop;

/**
 * 객체 지향
 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();

        musicPlayer.showStatus();

    }
}
