/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class ThreadSafeLazyInitialisationSingleton {
    private static ThreadSafeLazyInitialisationSingleton INSTANCE;
    private String info = "Initial info class";

    private ThreadSafeLazyInitialisationSingleton() {}

    public static synchronized ThreadSafeLazyInitialisationSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitialisationSingleton();
        }
        return INSTANCE;
    }
}
