/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public enum AudioType {
    MP4 {
        @Override
        public void play(String fileName, AdvancedMediaPlayer advancedMediaPlayer) {
            advancedMediaPlayer.playMp4(fileName);
        }
    },
    VLC {
        @Override
        public void play(String fileName, AdvancedMediaPlayer advancedMediaPlayer) {
            advancedMediaPlayer.playVlc(fileName);
        }
    };
    public abstract void play(final String fileName, AdvancedMediaPlayer advancedMediaPlayer);
}
