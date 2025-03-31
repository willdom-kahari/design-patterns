import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * This represents the Receiver
 *
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public final class Database<T> {
    private final Map<Integer, T> db = new HashMap<>();
    private static final Logger LOG = Logger.getLogger(Database.class.getName());

    public void insert(T data) {
        LOG.info("Before inserting new entity, the database has %d row(s)".formatted(db.size()));
        int id = db.size() + 1;
        db.put(id, data);
        LOG.info("After inserting new entity, the database has %d row(s)".formatted(db.size()));
    }

    public void update(int id, T newData) {
        LOG.info("Before update: %s".formatted(db.get(id)));
        db.put(id, newData);
        LOG.info("After update: %s".formatted(db.get(id)));
    }

    public void delete(int id) {
        LOG.info("Before deleting the entity with id %d, the database has %d row(s)".formatted(id, db.size()));
        db.remove(id);
        LOG.info("After deleting the entity with id %d, the database has %d row(s) now".formatted(id, db.size()));
    }
}
