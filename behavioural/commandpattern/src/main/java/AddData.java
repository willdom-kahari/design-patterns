/**
 * This is a ConcreteCommand to add data to the database
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class AddData<T> implements DatabaseCommand{
    private final T newEntity;
    private final Database<T> database;

    public AddData(T newEntity,Database<T> database) {
        this.newEntity = newEntity;
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert(newEntity);
    }
}
