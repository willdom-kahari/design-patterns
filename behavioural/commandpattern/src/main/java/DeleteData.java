/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class DeleteData<T> implements DatabaseCommand{
    private final Integer id;
    private final Database<T> database;

    public DeleteData(Integer id, Database<T> database) {
        this.id = id;
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete(id);
    }
}
