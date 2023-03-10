package shopToys.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileOperation
{
    public static void copyFile(File src, File dest) throws IOException {
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    /*
    public static void main(String[] args)
    {
        File from = new File("src.txt");
        File to = new File("dest.txt");

        try {
            copyFile(from, to);
            System.out.println("File copied successfully.");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    */

}

