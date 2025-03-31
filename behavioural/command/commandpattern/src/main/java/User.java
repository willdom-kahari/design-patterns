/**
 * This represents the client
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
public class User {
    public static void main(String[] args) {
        // Initialise the database
        Database<String> database = new Database<>();

        // Add data to the database
        DatabaseCommand addData = new AddData<>("Data to be added", database);
        DatabaseClient databaseClient = new DatabaseClient(addData);
        databaseClient.executeCommand();

        // Update data in the database
        DatabaseCommand updateData = new UpdateData<>(1, "Updated data", database);
        databaseClient = new DatabaseClient(updateData);
        databaseClient.executeCommand();

        // Delete data from the database
        DatabaseCommand deleteData = new DeleteData<>(1, database);
        databaseClient = new DatabaseClient(deleteData);
        databaseClient.executeCommand();

    }
}
