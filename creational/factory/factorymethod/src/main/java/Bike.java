import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Bike implements Vehicle{
    private static final Logger LOG = Logger.getLogger(Bike.class.getName());
    @Override
    public void drive() {
        LOG.info("Riding a bike ...");
    }
}
