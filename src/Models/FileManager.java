package Models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    private static final Path ACCOUNT_PATH = Paths.get(System.getProperty("user.dir"), "src", "Data", "Accounts.txt");

    private static final File file = ACCOUNT_PATH.toFile();

    public static File getAccountsFile() {
        return ACCOUNT_PATH.toFile();
    }

    public static boolean unlockFile() {
        return file.setWritable(true);
    }

    public static void lockFile() {
        if (file.exists()) {
            file.setReadOnly();
        }
    }
    
    public static void hideFile() {
        try {
            Files.setAttribute(ACCOUNT_PATH, "dos:hidden", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void showFile() {
        try {
            Files.setAttribute(ACCOUNT_PATH, "dos:hidden", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
