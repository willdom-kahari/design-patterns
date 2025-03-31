/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();
    private String info = "Initial info class";

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance(){
        return INSTANCE;
    }
    public String getInfo() {
        return info;
    }
}

