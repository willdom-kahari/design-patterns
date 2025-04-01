import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Truck implements Vehicle{
    private static final Logger LOG = Logger.getLogger(Truck.class.getName());
    @Override
    public void drive() {
        LOG.info("Driving a truck ...");
    }
}
