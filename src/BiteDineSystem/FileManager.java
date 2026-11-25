package BiteDineSystem;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    private static final Path ACCOUNT_PATH = Paths.get(System.getProperty("user.dir"), "src", "Data", "Accounts.txt");
    
    public static File getAccountsFile() {
        return ACCOUNT_PATH.toFile();
    }
}
