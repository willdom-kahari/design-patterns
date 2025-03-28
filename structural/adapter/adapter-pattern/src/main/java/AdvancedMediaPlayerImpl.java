/**
 * Adaptee concrete implementation
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.printf("Playing VLC file: %s%n", fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.printf("Playing MP4 file: %s%n", fileName);
    }
}
