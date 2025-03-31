/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public enum EnumSingleton {
    INSTANCE("Initial info class");
    private String info;
    EnumSingleton(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
}

