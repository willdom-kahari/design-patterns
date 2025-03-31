/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class LazyInitialisationSingleton {
    private static LazyInitialisationSingleton INSTANCE;
    private String info = "Initial info class";

    private LazyInitialisationSingleton() {}

    public static LazyInitialisationSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitialisationSingleton();
        }
        return INSTANCE;
    }
}
