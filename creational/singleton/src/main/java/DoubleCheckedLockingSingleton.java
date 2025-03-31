/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton INSTANCE;
    private String info = "Initial info class";

    private DoubleCheckedLockingSingleton() {
    }

    public String getInfo() {
        return this.info;
    }
    public static DoubleCheckedLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
