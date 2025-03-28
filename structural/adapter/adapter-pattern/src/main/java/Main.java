/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP4, "beautiful_day.mp4");
        audioPlayer.play(AudioType.VLC, "big_buck_bunny.vlc");
    }
}
