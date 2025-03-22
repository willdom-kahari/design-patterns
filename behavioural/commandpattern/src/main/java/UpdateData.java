/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class UpdateData<T> implements DatabaseCommand{
    private final Integer id;
    private final T newEntityData;
    private final Database<T> database;


    public UpdateData(Integer id, T newEntityData, Database<T> database) {
        this.id = id;
        this.newEntityData = newEntityData;
        this.database = database;
    }


    @Override
    public void execute() {
        database.update(id, newEntityData);
    }
}
