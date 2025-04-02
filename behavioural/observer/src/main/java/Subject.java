/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public interface Subject {
    void registerObservers(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
