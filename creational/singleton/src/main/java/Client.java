import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class Client {
    private static final Logger LOG = Logger.getLogger(Client.class.getName());
    public static void main(String[] args) {
        // Simple singleton
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
        LOG.info("Is simple singleton the same: " + (simpleSingleton1 == simpleSingleton2));

        // Enum singleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        LOG.info("Is enum singleton the same: " + ( enumSingleton1 == enumSingleton2));

        // Bill Pugh singleton
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        LOG.info("Is BillPugh singleton the same: " + (billPughSingleton1 == billPughSingleton2));

        // Double-checked locking singleton
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton2 = DoubleCheckedLockingSingleton.getInstance();
        LOG.info("Is Double-Checked locking singleton the same: " + (doubleCheckedLockingSingleton1 == doubleCheckedLockingSingleton2));

        // Lazy initialisation singleton
        LazyInitialisationSingleton lazyInitialisationSingleton1 = LazyInitialisationSingleton.getInstance();
        LazyInitialisationSingleton lazyInitialisationSingleton2 = LazyInitialisationSingleton.getInstance();
        LOG.info("Is Lazy initialisation singleton the same: " + (lazyInitialisationSingleton1 == lazyInitialisationSingleton2));

        // Thread-safe lazy initialisation singleton
        ThreadSafeLazyInitialisationSingleton threadSafeLazyInitialisationSingleton1 = ThreadSafeLazyInitialisationSingleton.getInstance();
        ThreadSafeLazyInitialisationSingleton threadSafeLazyInitialisationSingleton2 = ThreadSafeLazyInitialisationSingleton.getInstance();
        LOG.info("Is Thread-safe lazy initialisation singleton the same: " + (threadSafeLazyInitialisationSingleton1 == threadSafeLazyInitialisationSingleton2));
    }
}
