/**
 * Client
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class AudioPlayer implements MediaPlayer {
    private final MediaPlayer mediaPlayer;

    public AudioPlayer() {
        final AdvancedMediaPlayer player = new AdvancedMediaPlayerImpl();
        mediaPlayer = new MediaAdapter(player);
    }

    @Override
    public void play(AudioType type, String filename) {
        mediaPlayer.play(type, filename);
    }
}
