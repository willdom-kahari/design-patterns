/**
 * This class represents the Invoker
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class DatabaseClient {
    private final DatabaseCommand command;

    public DatabaseClient(DatabaseCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
