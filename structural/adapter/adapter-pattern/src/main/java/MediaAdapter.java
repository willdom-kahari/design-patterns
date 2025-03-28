/**
 * Adapter
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class MediaAdapter implements MediaPlayer{
    private final AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(AudioType audioType, String filename) {
        audioType.play(filename, advancedMediaPlayer);
    }
}
