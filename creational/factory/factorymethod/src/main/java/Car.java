import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Car implements  Vehicle{
    private static final Logger LOG = Logger.getLogger(Car.class.getName());
    @Override
    public void drive() {
        LOG.info("Driving a car ...");
    }
}
