import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class NewsChannel implements Observer{
    private final String name;
    private static final Logger LOG = Logger.getLogger(NewsChannel.class.getName());

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public <T> void update(T t) {
        if (t instanceof String message){
            LOG.info(name + " received: " + message);
        }
    }
}
